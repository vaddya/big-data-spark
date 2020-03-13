package com.vaddya.bigdata

import org.apache.spark.sql.expressions.Window.orderBy
import org.apache.spark.sql.functions._
import org.apache.spark.sql.{DataFrame, SparkSession}

object UserAgents {
  val reactionsPath = "useragents/ua_reactions.csv"
  val excludedPath = "useragents/excluded.txt"

  def main(args: Array[String]) {
    val spark = createSparkSession()
    val reactions = spark.read.option("header", "true").csv(reactionsPath)
    val excluded = spark.read.text(excludedPath).toDF("ua")
    
    val summary = reactions
      .join(excluded, Seq("ua"), "left_anti")
      .groupBy("ua")
      .agg(
        count(lit(1)).alias("shows"),
        sum(col("is_click")).alias("clicks")
      ).cache()

    topByCtr(summary, spark)
    halfShows(summary)

    spark.stop()
  }

  /**
   * Find top 5 User Agents by CTR where shows > 5 and CTR = clicks / shows
   */
  def topByCtr(summary: DataFrame, spark: SparkSession): Unit = {
    val summaryCtr = summary
      .filter(col("shows") > 5)
      .withColumn("ctr", col("clicks") / col("shows"))
    val topCtr = summaryCtr
      .sort(desc("ctr"))
      .takeAsList(5)
    println("Top 5 user agents by CTR:")
    spark.createDataFrame(topCtr, summaryCtr.schema).show(false)
  }

  /**
   * Find User Agents that make up half of all views
   */
  def halfShows(summary: DataFrame): Unit = {
    val totalShows = colSum(summary, "shows")
    val halfShows = summary
      .withColumn("cum_shows", sum("shows").over(orderBy(desc("shows"))))
      .filter(col("cum_shows") <= totalShows / 2)
    val half = colSum(halfShows, "shows")
    println(s"Agents with half shows ($half out of $totalShows): ")
    halfShows.show(false)
  }

  def createSparkSession(): SparkSession = {
    val spark = SparkSession.builder
      .appName("User Agents")
      .master("local")
      .getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    spark
  }

  def colSum(df: DataFrame, col: String): Long = df.agg(sum(col)).first.getLong(0)
}

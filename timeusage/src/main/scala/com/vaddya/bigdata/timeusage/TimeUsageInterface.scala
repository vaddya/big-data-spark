package com.vaddya.bigdata.timeusage

import org.apache.spark.sql._

object TimeUsageInterface {

  /**
   * Models a row of the summarized data set
   *
   * @param working      Working status (either "working" or "not working")
   * @param sex          Sex (either "male" or "female")
   * @param age          Age (either "young", "active" or "elder")
   * @param primaryNeeds Number of daily hours spent on primary needs
   * @param work         Number of daily hours spent on work
   * @param other        Number of daily hours spent on other activities
   */
  case class TimeUsageRow(
    working: String,
    sex: String,
    age: String,
    primaryNeeds: Double,
    work: Double,
    other: Double
  )
}

/**
 * The interface used by the grading infrastructure. Do not change signatures
 * or your submission will fail with a NoSuchMethodError.
 */
trait TimeUsageInterface {
  import TimeUsageInterface._

  val spark: SparkSession
  def classifiedColumns(columnNames: List[String]): (List[Column], List[Column], List[Column])
  def row(line: List[String]): Row
  def timeUsageGrouped(summed: DataFrame): DataFrame
  def timeUsageGroupedSql(summed: DataFrame): DataFrame
  def timeUsageGroupedSqlQuery(viewName: String): String
  def timeUsageGroupedTyped(summed: Dataset[TimeUsageRow]): Dataset[TimeUsageRow]
  def timeUsageSummary(primaryNeedsColumns: List[Column], workColumns: List[Column], otherColumns: List[Column], df: DataFrame): DataFrame
  def timeUsageSummaryTyped(timeUsageSummaryDf: DataFrame): Dataset[TimeUsageRow]
}

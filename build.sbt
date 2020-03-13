organization := "com.vaddya"
name := "bigdata"
version := "0.1"
scalaVersion := "2.12.10"

lazy val global = project
  .in(file("."))
  .settings(settings)
  .disablePlugins(AssemblyPlugin)
  .aggregate(
    useragents,
    binclass,
    titanic,
    wikipedia,
    stackoverflow,
    timeusage
  )

lazy val useragents = sparkProject("useragents")
lazy val binclass = sparkProject("binclass")
lazy val titanic = sparkProject("titanic")
lazy val wikipedia = sparkProject("wikipedia")
lazy val stackoverflow = sparkProject("stackoverflow")
lazy val timeusage = sparkProject("timeusage")

def sparkProject(dir: String) = Project(dir, file(dir))
  .settings(
    name := dir,
    settings,
    assemblySettings,
    libraryDependencies ++= dependencies
  )

lazy val dependencies = {
  val sparkVersion = "2.4.2"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-mllib" % sparkVersion
  )
}

lazy val settings = Seq(
  scalacOptions ++= compilerOptions
)

lazy val compilerOptions = Seq(
  "-unchecked",
  "-feature",
  "-deprecation",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-encoding",
  "utf8"
)

lazy val assemblySettings = Seq(
  assemblyJarName in assembly := name.value + ".jar",
  assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs@_*) => MergeStrategy.discard
    case "application.conf" => MergeStrategy.concat
    case x =>
      val oldStrategy = (assemblyMergeStrategy in assembly).value
      oldStrategy(x)
  }
)

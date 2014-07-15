import AssemblyKeys._

name := "scala-utilities"

version := "1.0.0"

organization := "com.kissthinker"

scalaVersion := "2.11.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

assemblySettings

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "2.3.7" % "test" withSources(),
  "org.scalatest" %% "scalatest" % "2.0" % "test" withSources(),
  "org.mockito" % "mockito-all" % "1.9.5" % "test" withSources()
)

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.2.2" withSources(),
  "org.json4s" %% "json4s-ext" % "3.2.2" withSources(),
  "ch.qos.logback" % "logback-core" % "1.0.13",
  "ch.qos.logback" % "logback-classic" % "1.0.13"
)
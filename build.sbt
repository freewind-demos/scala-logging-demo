name := "hello"

version := "1.0"

organization := "org.my"

scalaVersion := "2.12.4"

sbtVersion := "1.0.4"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  //  "org.json4s" %% "json4s-jackson" % "3.5.3"
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
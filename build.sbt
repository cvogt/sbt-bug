organization := "com.typesafe"

name := "sbt-bug"

version := "0.1"

scalaVersion := "2.10.2"

scalacOptions += "-deprecation"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "1.0.1",
  "com.h2database" % "h2" % "1.3.170",
  "org.xerial" % "sqlite-jdbc" % "3.6.20",
  "org.slf4j" % "slf4j-nop" % "1.6.4" // <- disables logging
)

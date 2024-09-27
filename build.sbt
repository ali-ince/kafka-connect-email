ThisBuild / scalaVersion := "2.13.14"
ThisBuild / scalacOptions ++= Seq("-release:11", "-deprecation", "-Werror")
ThisBuild / organization := "com.wardziniak"

name := "kafka-connect-email"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "connect-api" % "3.8.0" % "provided",
  "org.apache.commons" % "commons-email" % "1.6.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.17.2"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x                             => MergeStrategy.first
}

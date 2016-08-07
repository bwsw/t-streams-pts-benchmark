name := "t-streams-pts-benchmark"

val benchVersion = "1.0-SNAPSHOT"

version := benchVersion
organization := "com.bwsw"

scalaVersion := "2.11.8"

scalacOptions += "-feature"
scalacOptions += "-deprecation"

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("http://t-streams.com/"))

resolvers +=
"Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.bwsw" % "t-streams_2.11" % "1.0-SNAPSHOT")

assemblyJarName in assembly := "t-streams-pts-benchmark-" + benchVersion + ".jar"

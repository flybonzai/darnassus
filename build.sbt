name := "darnassus"

version := "0.1"

scalaVersion := "2.13.1"

val akkaVersion = "2.5.25"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-typed" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)
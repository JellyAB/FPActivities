name := "FPActivities"

version := "0.1"

scalaVersion := "2.13.2"
lazy val akkaVersion = "2.6.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)
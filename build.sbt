enablePlugins(GatlingPlugin)

name := "akka-http-practice"

version := "1.0"

scalaVersion := "2.11.7"


libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.0.1"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.1.7" % "test"
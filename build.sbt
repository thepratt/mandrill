organization := "aristocrat"

version := "0.0.0"

scalaVersion := "2.11.6"

fork in run := true

resolvers ++= Seq(
    Resolver.sonatypeRepo("releases"),
    "Twitter Maven" at "http://maven.twttr.com",
    "Finatra Repo" at "http://twitter.github.com/finatra",
    "softprops-maven" at "http://dl.bintray.com/content/softprops/maven")

libraryDependencies ++= Seq(
    "com.twitter.finatra" %% "finatra-http" % "2.0.0",
    "com.twitter.finatra" %% "finatra-httpclient" % "2.0.0",
    "com.twitter.finatra" %% "finatra-slf4j" % "2.0.0",
    "com.twitter.inject" %% "inject-core" % "2.0.0",
    "ch.qos.logback" % "logback-classic" % "1.0.13",
    "com.twitter" %% "finagle-stats" % "6.28.0")

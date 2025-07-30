ThisBuild / scalaVersion := "3.7.2"

lazy val cryptic = project
  .in(file("."))
  .settings(libraryDependencies ++= Seq(
    "ScalaCrypto" %% "core" % "0.7.0-SNAPSHOT"
  ))

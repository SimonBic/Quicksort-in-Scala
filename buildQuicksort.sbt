ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

Compile / mainClass := Some("example.quicksort")

lazy val root = (project in file("."))
  .settings(
    name := "quicksort"
  )

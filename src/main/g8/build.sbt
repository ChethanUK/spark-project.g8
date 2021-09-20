import sbt.Keys.libraryDependencies

name := "$name$"
scalaVersion     := "2.12.15"
organization := "$organization$"
version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies += scalaTest % Test,
    libraryDependencies += sparkCore % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

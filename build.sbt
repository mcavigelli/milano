name := """milano"""
organization := "ch.luna"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.12"

libraryDependencies += guice

checkstyleSeverityLevel := CheckstyleSeverityLevel.Error
(Compile / checkstyle) := (Compile / checkstyle).triggeredBy(Compile / compile).value

// The Play plugin
addSbtPlugin("org.playframework" % "sbt-plugin" % "3.0.1")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.16.2")

// checkstyle run is a part of the compile cycle
dependencyOverrides += "com.puppycrawl.tools" % "checkstyle" % "10.12.7"
addSbtPlugin("software.purpledragon" % "sbt-checkstyle-plugin" % "4.0.1")


scalaVersion := "2.12.7"

addCompilerPlugin(scalafixSemanticdb)

scalacOptions += "-Yrangepos"

libraryDependencies += "io.spray" %% "spray-json" % "1.3.5"
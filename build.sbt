lazy val V = _root_.scalafix.sbt.BuildInfo
inThisBuild(
  List(
    organization := "org.scalatest",
    homepage := Some(url("https://github.com/scalatest/scalatestplus-scalafix")),
    licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
      Developer(
        "bvenners",
        "Bill Venners",
        "bill@artima.com",
        url("https://www.artima.com")
      )
    ),
    scalaVersion := V.scala212,
    addCompilerPlugin(scalafixSemanticdb),
    scalacOptions ++= List(
      "-Yrangepos"
    )
  )
)

skip in publish := true

lazy val rules = project.settings(
  moduleName := "named-literal-arguments",
  libraryDependencies += "ch.epfl.scala" %% "scalafix-core" % V.scalafixVersion
)

lazy val input = project.settings(
  skip in publish := true,
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.6-SNAP-for-scalafix",
  libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0",
  libraryDependencies += "org.easymock" % "easymockclassextension" % "3.2",
  libraryDependencies += "org.jmock" % "jmock-legacy" % "2.8.3"
)

lazy val output = project.settings(
  skip in publish := true,
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.6-SNAP-for-scalafix",
  libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0",
  libraryDependencies += "org.easymock" % "easymockclassextension" % "3.2",
  libraryDependencies += "org.jmock" % "jmock-legacy" % "2.8.3"
)

lazy val tests = project
  .settings(
    skip in publish := true,
    libraryDependencies += "ch.epfl.scala" % "scalafix-testkit" % V.scalafixVersion % Test cross CrossVersion.full,
    scalafixTestkitOutputSourceDirectories :=
      sourceDirectories.in(output, Compile).value,
    scalafixTestkitInputSourceDirectories :=
      sourceDirectories.in(input, Compile).value,
    scalafixTestkitInputClasspath :=
      fullClasspath.in(input, Compile).value
  )
  .dependsOn(rules)
  .enablePlugins(ScalafixTestkitPlugin)

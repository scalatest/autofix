# Autofix for ScalaTest 3.1.x
This scalafix rule will rewrite your ScalaTest code to eliminate most of the deprecation warnings
introduced in ScalaTest 3.1.0. The deprecations were primarily renames of object, classes, and traits to
pave the way for the internal modularization of ScalaTest in 3.2.0. The internal modularization of ScalaTest
will allow projects to depend on a chosen subset of ScalaTest in their build to more easily keep test code
consistent across the project.

To use this plugin with sbt, please follow these steps ([Maven](https://github.com/evis/scalafix-maven-plugin)
and [Mill](https://github.com/joan38/mill-scalafix) plugins are also available):

  - Add `sbt-scalafix` to your `project/plugins.sbt` (a [newer version](https://github.com/scalacenter/sbt-scalafix/releases) might be required for the latest Scala releases):

```
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.18-1")
```

  - If you have `-Xfatal-warnings` set, comment it out for the scalafix process, because otherwise
    the deprecation warnings will stop your build before autofix is given a chance to fix them.

```
// scalacOptions += "-Xfatal-warnings"
```

  - Enable scalafix for the current sbt session:

```
sbt> scalafixEnable
```

  - In the sbt prompt, issue the following command to have autofix applied to your main & test source files: 
  
```
sbt> scalafixAll dependency:RewriteDeprecatedNames@org.scalatest:autofix:3.1.0.1
```

  - Check the changes made with `git diff`.

  - If you turned `-Xfatal-warnings` off earlier, you can turn it back on now:

```
scalacOptions += "-Xfatal-warnings"
```
  

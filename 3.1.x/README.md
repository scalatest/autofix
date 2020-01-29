# Autofix for ScalaTest 3.1.x
This scalafix application will rewrite your ScalaTest code to eliminate most of the deprecation warnings
introduced in ScalaTest 3.1.0. The deprecations were primarily renames of object, classes, and traits to
pave the way for the internal modularization of ScalaTest in 3.2.0. The internal modularization of ScalaTest
will allow projects to depend on a chosen subset of ScalaTest in their build to more easily keep test code
consistent across the project.

To use this plugin with sbt, please follows these steps (for Maven, use the <a href="https://github.com/evis/scalafix-maven-plugin">scalafix-maven-plugin</a>): 

  - Add `sbt-scalafix` to your `project/plugins.sbt`:

```
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.4")
```

  - Add the following settings to your `build.sbt`:
  
```
scalafixDependencies in ThisBuild += "org.scalatest" %% "autofix" % "3.1.0.0" 

addCompilerPlugin(scalafixSemanticdb) // enable SemanticDB
``` 

  - Or, if your project doesn't use a `build.sbt`, you'll need to make the above changes to `project/your-build-file.sbt`.

  - If you have `-Xfatal-warnings` set, comment it out for the scalafix process, because otherwise
    the deprecation warnings will stop your build before autofix is given a chance to fix them.

```
// scalacOptions += "-Xfatal-warnings"
```

  - In the sbt prompt, issue the following command to have autofix applied to your test source files: 
  
```
sbt> test:scalafix RewriteDeprecatedNames
```

  - In case you want to apply autofix to your main source files, you'll issue the following command: 
  
```
sbt> scalafix RewriteDeprecatedNames
```  

  - Check the changes made with `git diff`.

  - If you turned `-Xfatal-warnings` off earlier, you can turn it back on now:

```
scalacOptions += "-Xfatal-warnings"
```
  



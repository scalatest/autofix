# Autofix for ScalaTest 3.0.x
Auto-fixing error due to version upgrade, good practice etc.

To use this plugin, please follows these steps: 

  - Add `sbt-scalafix` to your `project/plugins.sbt`:

```
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.4")
```

  - Add the following settings to your `build.sbt` or, if you don't have a `build.sbt`, to `project/your-build-file.sbt`: 
  
```
scalafixDependencies in ThisBuild += "org.scalatest" %% "autofix-3.0.8" % "1.0.0" 

addCompilerPlugin(scalafixSemanticdb) // enable SemanticDB
``` 

  - If you have `-Xfatal-warnings` set, comment it out for the scalafix process, because otherwise
    the deprecation warnings will stop your build before autofix is given a chance to fix them.

```
// scalacOptions += "-Xfatal-warnings"
```

  - In the sbt prompt, issue the following command to have autofix applied to your test source files: 
  
```
sbt> test:scalafix RenameDeprecatedPackage
```

  - In case you want to apply autofix to your main source files, you'll issue the following command: 
  
```
sbt> scalafix RenameDeprecatedPackage
```  

  - Check the changes made with `git diff`.



# Autofix for ScalaTest 3.0.6
Auto-fixing error due to version upgrade, good practice etc.

To use this plugin, please follows these steps: 

  - Add `sbt-scalafix` to your `project/plugins.sbt`:

```
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.4")
```

  - Add the following settings in your project: 
  
```
scalafixDependencies in ThisBuild += "org.scalatest" %% "autofix-3.1.0" % "1.0.0", 
addCompilerPlugin(scalafixSemanticdb) // enable SemanticDB
``` 

  - In sbt prompt, issue the following command to have the autofix applied to your test source files: 
  
```
sbt> test:scalafix RewriteDeprecatedNames
```

  - In case you need to apply it to your main source files, you'll issue the following command instead: 
  
```
sbt> scalafix RewriteDeprecatedNames
```  

  - Check the changes made with `git diff`.

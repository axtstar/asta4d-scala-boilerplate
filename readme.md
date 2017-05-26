# asta4d scala boilerplate

## How to use

> git clone --depth 1 https://github.com/axtstar/asta4d-scala-boilerplate.git [your project name]

## How to run

> sbt ~jetty:run

## How to pack

> sbt package

## asta4d structure

```
.
├── build.sbt
├── project
│   └── assembly.sbt
├── readme.md
├── src
│   └── main
│       ├── resources
│       │   ├── asta4d.conf.properties
│       │   ├── logback.xml
│       │   └── spring
│       │       ├── configuration.xml
│       │       └── snippet.xml
│       ├── scala
│       │   └── com
│       │       └── axtstar
│       │           └── asta4d
│       │               └── sample
│       │                   ├── handler
│       │                   │   └── SampleHandler.scala
│       │                   ├── rules
│       │                   │   └── UrlRuleInitializer.scala
│       │                   └── snippet
│       │                       └── SampleSnippet.scala
│       └── webapp
│           ├── WEB-INF
│           │   └── web.xml
│           └── index.html
├── start.sh
└── target
```
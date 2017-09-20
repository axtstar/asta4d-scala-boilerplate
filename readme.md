# asta4d scala boilerplate

Asta4d is a web framework based on servlet api but idea based on Lift framework.

This is a sample app.

# How to use

> git clone -depth 1 https://github.com/axtstar/asta4d-scala-boilerplate.git <your-project-name>

## How to run

> sbt ~jetty:start

access to web browser at "http://127.0.0.1/8080".

See here ![asta4d](https://github.com/astamuse/asta4d)

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
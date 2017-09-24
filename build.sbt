name := "asta4dSample"
version := "0.0.2"
scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.astamuse" % "asta4d-core" % "1.2-M2",
  "com.astamuse" % "asta4d-web" % "1.2-M2",
  "com.astamuse" % "asta4d-scala" % "0.6",

  "org.hibernate" % "hibernate-validator" % "5.2.4.Final",
  "commons-validator" % "commons-validator" % "1.6",

  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)

enablePlugins(JettyPlugin)

containerPort := 8080

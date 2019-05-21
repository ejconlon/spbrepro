lazy val root = (project in file("."))
  .settings(
    name := "Hello",
    scalaVersion := "2.12.8",
    PB.targets in Compile := Seq(
        scalapb.gen() -> (sourceManaged in Compile).value
    ),
    libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
  )

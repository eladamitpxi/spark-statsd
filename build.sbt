lazy val commonSettings = Seq(
  organization := "spark.metrics",
  scalaVersion := "2.10.6"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "spark-statsd",
    version := "1.0.1"
  )

sparkVersion := "1.6.1"
spName := "eladamitpxi/spark-statsd"
spShortDescription := "Statsd metrics reporter for spark"
spDescription := """Statsd metrics reporter for spark.
                   |Helps spark to push metrics to statsd. See ReadMe for more details""".stripMargin


assemblyJarName in assembly := s"${name.value}-${version.value}-full.jar"

import sbt._

object Dependencies {

  // Libraries
  lazy val scalaTest  = "org.scalatest" %% "scalatest" % "3.2.0-M1" % "test"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.14.2" % "test"
  lazy val loggers    = "ch.qos.logback" % "logback-classic" % "1.2.3"

  // Test
  val testDeps =
    Seq(scalaTest, scalaCheck)
  val logs = Seq(loggers)
}

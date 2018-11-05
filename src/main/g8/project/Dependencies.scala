import sbt._

object Dependencies {

  // Libraries
  lazy val scalaTest  = "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  lazy val loggers    = "ch.qos.logback" % "logback-classic" % "1.2.3" % "test"

  // Test
  val testDeps =
    Seq(scalaTest, scalaCheck)
  val logs = Seq(loggers)
}

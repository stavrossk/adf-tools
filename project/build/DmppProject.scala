import sbt._

class DmppProject(info: ProjectInfo) extends DefaultProject(info) {
  val mavenLocal = "Local Maven Repository" at "file://" +
    (Path.userHome / ".m2" / "repository").absolutePath

  val specs = "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5" % "test->default"
  lazy val core = project("adf-core", "adf-core")
  lazy val gui  = project("adf-gui",  "adf-gui", core)
}
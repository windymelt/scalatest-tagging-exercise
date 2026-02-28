val scala3Version = "3.8.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scalatest-tagging-exercise",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )

lazy val testOnlyHeavy = taskKey[Unit]("Run only the heavy tests")
testOnlyHeavy := (Test / testOnly)
  .toTask(
    " -- -n dev.capslock.scalatesttaggingexercise.tags.Heavy"
  )
  .value

lazy val testOnlySlow = taskKey[Unit]("Run only the slow tests")
testOnlySlow := (Test / testOnly)
  .toTask(
    " -- -n org.scalatest.tags.Slow"
  )
  .value

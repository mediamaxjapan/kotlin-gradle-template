object Deps {

  const val kotlinVersion = "1.3.31"
  const val jvmTarget = "11"

  const val shadowPath = "com.github.jengelman.gradle.plugins:shadow:5.0.0"
  const val shadow = "com.github.johnrengelman.shadow"

  const val stdlib = "stdlib-jdk8"
  const val junit = "org.junit.jupiter:junit-jupiter:5.4.2"
  const val hamkrest = "com.natpryce:hamkrest:1.7.0.0"
  const val spek = "org.spekframework.spek2:spek-dsl-jvm:2.0.5"
  const val spekRunner = "org.spekframework.spek2:spek-runner-junit5:2.0.5"
  const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:1.3.31"

  val junitEngines = arrayOf("junit5", "spek2")
  val testEvents = arrayOf("passed", "skipped", "failed")

}
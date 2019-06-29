object Deps {

  const val kotlinVersion = "1.3.40"
  const val jvmTarget = "11"

  const val shadowPath = "com.github.jengelman.gradle.plugins:shadow:5.0.0"
  const val shadow = "com.github.johnrengelman.shadow"

  const val stdlib = "stdlib-jdk8"
  const val junit = "org.junit.jupiter:junit-jupiter:5.4.2"
  const val hamkrest = "com.natpryce:hamkrest:1.7.0.0"
  const val spek = "org.spekframework.spek2:spek-dsl-jvm:2.0.5"
  const val spekRunner = "org.spekframework.spek2:spek-runner-junit5:2.0.5"
  const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:1.3.31"

  const val inject = "javax.inject:javax.inject:1"

  private const val joobyVersion = "1.6.2"
  const val joobyPlugin = "org.jooby:jooby-gradle-plugin:$joobyVersion"
  const val joobyKotlin = "org.jooby:jooby-lang-kotlin:$joobyVersion"
  const val joobyNetty = "org.jooby:jooby-netty:$joobyVersion"
  const val joobyApitool = "org.jooby:jooby-apitool:$joobyVersion"
  const val joobyJackson = "org.jooby:jooby-jackson:$joobyVersion"
  const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:2.9.9"


  // for swagger on JDK11
  // java.lang.NoClassDefFoundError: javax/xml/bind/annotation/XmlRootElement
  // https://crunchify.com/java-11-and-javax-xml-bind-jaxbcontext/
  const val jaxbApi = "javax.xml.bind:jaxb-api:2.3.1"
  const val jaxbCore = "com.sun.xml.bind:jaxb-core:2.3.0.1"
  const val jaxbImpl = "com.sun.xml.bind:jaxb-impl:2.3.1"

  val junitEngines = arrayOf("junit5", "spek2")
  val testEvents = arrayOf("passed", "skipped", "failed")

}
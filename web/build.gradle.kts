plugins {
  base
  application
  kotlin("jvm")
  id(Deps.shadow)
  id("jooby")
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(project(":core"))
  implementation(kotlin(Deps.stdlib))
  implementation(Deps.inject)
  implementation(Deps.joobyKotlin)
  implementation(Deps.joobyNetty)
  implementation(Deps.joobyAssets)
  implementation(Deps.joobyApitool)

  implementation(Deps.joobyJackson)
  runtime(Deps.jacksonKotlin)

  // fix swagger error on Java 11
  runtime(Deps.jaxbApi)
  runtime(Deps.jaxbCore)
  runtime(Deps.jaxbImpl)

  testImplementation(Deps.junit)
  testImplementation(Deps.spek)
  testImplementation(Deps.hamkrest)
  testRuntimeOnly(Deps.spekRunner)
  // spek requires kotlin-reflect, can be omitted if already in the classpath
  testRuntimeOnly(Deps.kotlinReflect)
}

// shadowJar に反映される
application {
    mainClassName = "Main"
}

sourceSets {
  main {
    resources {
      srcDirs("conf", "public")
    }
  }
}

tasks {
  test {
    useJUnitPlatform {
      // 二つとも指定しないとテストが走らない、片方だけではダメ
      includeEngines(*Deps.junitEngines)
    }
    testLogging {
      events(*Deps.testEvents)
    }
  }
  compileKotlin {
    kotlinOptions.jvmTarget = Deps.jvmTarget
  }
}


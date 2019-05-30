plugins {
  base
  application
  kotlin("jvm")
  id(Deps.shadow)
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(project(":core"))
  implementation(kotlin(Deps.stdlib))
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


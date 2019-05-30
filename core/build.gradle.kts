plugins {
  base
  `java-library`
  kotlin("jvm")
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(kotlin(Deps.stdlib))
  testImplementation(Deps.junit)
  testImplementation(Deps.spek)
  testImplementation(Deps.hamkrest)
  testRuntimeOnly(Deps.spekRunner)
  // spek requires kotlin-reflect, can be omitted if already in the classpath
  testRuntimeOnly(Deps.kotlinReflect)
}

// val test: Test by tasks
// val compileKotlin: KotlinCompile by tasks
// よりも tasks ブロックで書く方がわかりやすい
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


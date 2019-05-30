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
  implementation(kotlin("stdlib-jdk8"))
  testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
  testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.5")
  testImplementation("com.natpryce:hamkrest:1.7.0.0")
  testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.5")
  // spek requires kotlin-reflect, can be omitted if already in the classpath
  testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.31")
}

// val test: Test by tasks
// val compileKotlin: KotlinCompile by tasks
// よりも tasks ブロックで書く方がわかりやすい
tasks {
  test {
    useJUnitPlatform {
      // 二つとも指定しないとテストが走らない、片方だけではダメ
      includeEngines("junit5", "spek2")
    }
    testLogging {
      events("passed", "skipped", "failed")
    }
  }
  compileKotlin {
    kotlinOptions.jvmTarget = "11"
  }
}


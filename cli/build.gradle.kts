plugins {
  base
  application
  kotlin("jvm")
  id("com.github.johnrengelman.shadow")
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(project(":core"))
  implementation(kotlin("stdlib-jdk8"))
  testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.5")
  testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.5")
  // spek requires kotlin-reflect, can be omitted if already in the classpath
  testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.31")
}

// shadowJar に反映される
application {
    mainClassName = "Main"
}

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
  shadowJar {
    // slf4j, jdbc driver など Class.forName は対象外にしないといけない
    minimize()
  }
}


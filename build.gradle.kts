buildscript {
  repositories {
    mavenCentral()
    jcenter()
  }
  dependencies {
    classpath(kotlin("gradle-plugin", version = "1.3.31"))
    classpath("com.github.jengelman.gradle.plugins:shadow:5.0.0")
  }
}

allprojects {
  group = "dev.onda.example"
  version = "1.0-SNAPSHOT"
}


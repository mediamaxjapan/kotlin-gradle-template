buildscript {
  repositories {
    mavenCentral()
    jcenter()
  }
  dependencies {
    classpath(kotlin("gradle-plugin", version = Deps.kotlinVersion))
    classpath(Deps.joobyPlugin)
    classpath(Deps.shadowPath)
  }
}

allprojects {
  group = "dev.onda.example"
  version = "1.0-SNAPSHOT"
}


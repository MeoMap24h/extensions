buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.lagradost.cloud/maven")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.lagradost.cloud/maven")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

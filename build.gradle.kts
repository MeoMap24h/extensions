pluginManagement {
    repositories {
        maven { url = uri("https://maven.cloudstream.cf/releases") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    // Không cần khai báo gì ở đây
}

allprojects {
    repositories {
        maven { url = uri("https://maven.cloudstream.cf/releases") }
        google()
        mavenCentral()
    }
}

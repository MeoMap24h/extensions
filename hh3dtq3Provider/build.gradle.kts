plugins {
    id("com.android.library")
    kotlin("android")
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    language = "vi"
    description = "Plugin cho trang hh3dtq3.net"
    authors = listOf("MeoMap24h")
}

android {
    namespace = "recloudstream"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}

dependencies {
    implementation("com.github.recloudstream.cloudstream:library-jvm:master")
    implementation("org.jsoup:jsoup:1.18.3")
    implementation("com.github.Blatzar:NiceHttp:0.4.11")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
    implementation(kotlin("stdlib"))
}
{}

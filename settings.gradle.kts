pluginManagement {
    repositories {
        maven { url = uri("https://maven.cloudstream.cf/releases") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "CloudstreamPlugins"

val disabled = listOf<String>()

fun File.eachDir(block: ( }?.forEach { block(it) }
}

File(rootDir, ".").eachDir { dir ->
    if (!disabled.contains(dir.name) && File(dir, "build.gradle.kts").exists()) {
        include(dir.name)
    }
}

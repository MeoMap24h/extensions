pluginManagement {
    repositories {
        maven { url = uri("https://maven.cloudstream.cf/releases") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "CloudstreamPlugins"

// This file sets what projects are included.
// All new projects should get automatically included unless specified in the "disabled" variable.

val disabled = listOf<String>()

fun File.eachDir(block: (File) -> Unit) {
    listFiles()?.filter { it.isDirectory }?.forEach { block(it) }
}

File(rootDir, ".").eachDir { dir ->
    if (!disabled.contains(dir.name) && File(dir, "build.gradle.kts").exists()) {
        include(dir.name)
    }
}

// To only include a single project, comment out the previous lines (except the first one), and include your plugin like so:
// include("PluginName")

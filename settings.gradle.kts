pluginManagement {
    repositories {
        maven { url = uri("https://maven.cloudstream.cf/releases") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "CloudstreamPlugins"

fun File.eachDir(block: (File) -> Unit) {
    listFiles()?.filter { it.isDirectory }?.forEach { block(it) }
}

val disabled = listOf<String>()

File(rootDir, ".").eachDir { dir ->
    if (!disabled.contains(dir.name) && File(dir, "build.gradle.kts").exists()) {
        include(dir.name)
    }
}

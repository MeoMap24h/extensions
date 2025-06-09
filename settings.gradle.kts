pluginManagement {
    repositories {
        maven { url = uri("https://maven.cloudstream.cf/releases") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "CloudstreamPlugins"

// Hàm tiện ích, đặt trước khi dùng!
fun File.eachDir(block: (File) -> Unit) {
    listFiles()?.filter { it.isDirectory }?.forEach { block(it) }
}

// Danh sách disable, có thể để trống
val disabled = listOf<String>()

// Tự động include tất cả plugin có build.gradle.kts
File(rootDir, ".").eachDir { dir ->
    if (!disabled.contains(dir.name) && File(dir, "build.gradle.kts").exists()) {
        include(dir.name)
    }
}

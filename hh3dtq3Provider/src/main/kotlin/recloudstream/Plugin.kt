// File: hh3dtq3Provider/src/main/kotlin/Plugin.kt

package `your.package.name` // Có thể để trống, hoặc bỏ dòng này nếu không có package

import recloudstream.Hh3dtq3Provider

class Plugin : PluginMain() {
    override fun load(context: PluginContext) {
        registerMainAPI(Hh3dtq3Provider())
    }
}

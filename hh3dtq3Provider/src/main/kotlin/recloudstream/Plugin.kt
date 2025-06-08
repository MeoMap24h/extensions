import recloudstream.Hh3dtq3Provider

class Plugin : PluginMain() {
    override fun load(context: PluginContext) {
        registerMainAPI(Hh3dtq3Provider())
    }
}

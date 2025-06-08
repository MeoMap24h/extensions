package recloudstream

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class Hh3dtq3Plugin : BasePlugin() {
    override fun load() {
        registerMainAPI(Hh3dtq3Provider())
    }
}

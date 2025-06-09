package recloudstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class Plugin : CloudstreamPlugin() {
    override fun load(context: Context) {
        registerMainAPI(Hh3dtq3Provider())
    }
}

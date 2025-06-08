package recloudstream

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.MainPageRequest
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.TvType

class Hh3dtq3Provider : MainAPI() {
    override var mainUrl = "https://hh3dtq3.net"
    override var name = "HH3DTQ3"
    override val hasMainPage = true
    override var lang = "vi"

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse? {
        return null
    }

    override suspend fun load(url: String): LoadResponse? {
        return null
    }
}

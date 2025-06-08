package recloudstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.tryParseJson
import com.lagradost.cloudstream3.utils.StringUtils.encodeUri
import com.lagradost.cloudstream3.utils.loadExtractor

class Hh3dtq3Provider : MainAPI() {

    override var mainUrl = "https://hh3dtq3.net"
    override var name = "HH3DTQ3"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
    override var lang = "vi"
    override val hasMainPage = true

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        // TODO: Viết hàm crawl dữ liệu trang chủ từ hh3dtq3.net
        // Ví dụ mẫu:
        // val response = app.get("$mainUrl/path").document
        // val homeList = listOf(
        //     HomePageList(
        //         "Danh sách phim mới",
        //         listOf(/* SearchResponse */),
        //         false
        //     )
        // )
        // return newHomePageResponse(homeList, false)
        return newHomePageResponse(listOf(), false)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        // TODO: Viết hàm crawl dữ liệu tìm kiếm từ hh3dtq3.net
        // Ví dụ mẫu:
        // val response = app.get("$mainUrl/search?keyword=${query.encodeUri()}").document
        // return response.select("selector").map { ... }
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse? {
        // TODO: Viết hàm crawl dữ liệu chi tiết phim từ hh3dtq3.net
        // Ví dụ mẫu:
        // val response = app.get(url).document
        // return newMovieLoadResponse(...)
        return null
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // Nếu trang có player dùng link ngoài, sử dụng loadExtractor
        // loadExtractor("link", subtitleCallback, callback)
        return true
    }
}

package recloudstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.MainAPI

class Hh3dtq3Provider : MainAPI() {
    override var mainUrl = "https://hh3dtq3.net"
    override var name = "HH3DTQ3"
    override val hasMainPage = true
    override var lang = "vi"

    // Bạn cần viết lại các hàm dưới đây cho đúng với cấu trúc của trang hh3dtq3.net

    override suspend fun search(query: String): List<SearchResponse> {
        // TODO: Viết hàm crawl dữ liệu tìm kiếm từ trang hh3dtq3.net
        return emptyList()
    }

    override suspend fun getMainPage(page: Int, request : MainPageRequest): HomePageResponse? {
        // TODO: Viết hàm crawl dữ liệu trang chủ từ hh3dtq3.net
        return null
    }

    override suspend fun load(url: String): LoadResponse? {
        // TODO: Viết hàm crawl dữ liệu chi tiết phim từ hh3dtq3.net
        return null
    }
}

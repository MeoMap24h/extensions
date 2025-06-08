class Hh3dtq3Provider : MainAPI() {
    override var mainUrl = "https://hh3dtq3.net"
    override var name = "HH3DTQ3"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
    override var lang = "vi"
    override val hasMainPage = true

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(listOf(), false)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse? {
        return null
    }
}

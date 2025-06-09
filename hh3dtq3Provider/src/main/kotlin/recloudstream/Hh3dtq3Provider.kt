package recloudstream

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Hh3dtq3Provider : MainAPI() {
    override var mainUrl = "https://hh3dtq3.net/"
    override var name = "hh3dtq3"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries, TvType.Others)
    // Viết code lấy phim ở đây
}

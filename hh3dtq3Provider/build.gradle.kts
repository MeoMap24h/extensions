// use an integer for version numbers
version = 3

cloudstream {
    // Các thuộc tính này đều có thể tuỳ chỉnh hoặc bỏ nếu không cần.

    description = "Plugin cho trang hh3dtq3.net"
    authors = listOf("MeoMap24h")

    /**
     * Status int as one of the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta-only
     **/
    status = 1 // 1 = Ok, bạn có thể đổi nếu cần

    tvTypes = listOf("Movie", "TV", "Others") // Chỉnh theo loại nội dung trang cung cấp

    iconUrl = "https://www.google.com/s2/favicons?domain=hh3dtq3.net&sz=%size%"

    isCrossPlatform = true
}

plugins {
    id("cloudstream-plugin")
}

version = 3 // Số version bạn tự tăng

cloudstream {
    description = "Plugin cho trang hh3dtq3.net"
    authors = listOf("MeoMap24h")
    status = 1
    tvTypes = listOf("Movie", "TV", "Others")
    iconUrl = "https://www.google.com/s2/favicons?domain=hh3dtq3.net&sz=%size%"
    isCrossPlatform = true
}

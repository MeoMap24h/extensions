plugins {
    id("com.lagradost.cloudstream3.gradle")
}

version = 3

cloudstream {
    description = "Plugin cho trang hh3dtq3.net"
    authors = listOf("MeoMap24h")
    status = 1
    tvTypes = listOf("Movie", "TV", "Others")
    iconUrl = "https://www.google.com/s2/favicons?domain=hh3dtq3.net&sz=%size%"
    isCrossPlatform = true
}

package org.iagxferreira.kmmpoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
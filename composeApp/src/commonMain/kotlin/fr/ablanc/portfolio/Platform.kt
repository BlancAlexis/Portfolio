package fr.ablanc.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
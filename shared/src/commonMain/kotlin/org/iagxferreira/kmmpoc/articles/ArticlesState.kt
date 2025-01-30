package org.iagxferreira.kmmpoc.articles

class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
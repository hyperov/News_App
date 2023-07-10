package com.hyper.newsapp.news.model

import com.hyper.newsapp.common.Pagination
import com.hyper.newsapp.news.model.response.NewsItem

data class NewsRepoModel(
    val news: List<NewsItem>?, val error: String? = null,
    val pagination: Pagination? = null
)

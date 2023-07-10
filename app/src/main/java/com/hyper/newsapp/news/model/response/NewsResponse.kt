package com.hyper.newsapp.news.model.response

import com.google.gson.annotations.SerializedName
import com.hyper.newsapp.common.ParentResponse
import com.hyper.newsapp.news.model.NewsRepoModel

data class NewsResponse(

    @field:SerializedName("data")
    val news: List<NewsItem>,
) : ParentResponse()

fun NewsResponse.toNewsRepoModel(): NewsRepoModel {
    return NewsRepoModel(
        news = news,
        error = error?.message,
        pagination = pagination
    )
}
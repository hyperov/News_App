package com.hyper.newsapp.news.model.repo

import com.hyper.newsapp.news.model.response.NewsResponse
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(private val newsApi: NewsApi) : NewsDataSource {

    override suspend fun getRemoteNews(): NewsResponse {
        return newsApi.getAllNews("accessKey")
    }

    override suspend fun getLocalNews(): NewsResponse {
        return NewsResponse(listOf())
    }
}
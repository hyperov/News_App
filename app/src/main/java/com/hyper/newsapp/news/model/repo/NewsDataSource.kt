package com.hyper.newsapp.news.model.repo

import com.hyper.newsapp.news.model.response.NewsResponse

interface NewsDataSource {

    suspend fun getRemoteNews(): NewsResponse

    suspend fun getLocalNews(): NewsResponse
}
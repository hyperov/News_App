package com.hyper.newsapp.news.model.remote

import com.hyper.newsapp.news.model.response.NewsResponse
import kotlinx.coroutines.flow.Flow

interface NewsRemoteDataSource {

    suspend fun getNews(offset: Int): Flow<NewsResponse>

}
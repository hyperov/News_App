package com.hyper.newsapp.news.model.local

import com.hyper.newsapp.news.model.response.NewsItem
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {

    suspend fun getNews(offset: Int): Flow<List<NewsItem>>

}
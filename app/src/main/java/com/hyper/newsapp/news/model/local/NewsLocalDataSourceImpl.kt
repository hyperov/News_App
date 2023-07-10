package com.hyper.newsapp.news.model.local

import com.hyper.newsapp.news.model.response.NewsItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject


class NewsLocalDataSourceImpl @Inject constructor(private val database: AppDatabase) :
    NewsLocalDataSource {

    override suspend fun getNews(offset: Int): Flow<List<NewsItem>> =
        flowOf(database.newsDao().getNews())

}
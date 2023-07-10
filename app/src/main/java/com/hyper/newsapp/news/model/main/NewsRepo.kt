package com.hyper.newsapp.news.model.main

import com.hyper.newsapp.news.model.NewsRepoModel
import kotlinx.coroutines.flow.Flow

interface NewsRepo {

    suspend fun getNews(offset: Int,isOnline: Boolean): Flow<NewsRepoModel>
}
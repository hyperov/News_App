package com.hyper.newsapp.news.model.local

import androidx.room.Dao
import androidx.room.Query
import com.hyper.newsapp.news.model.response.NewsItem

@Dao
interface NewsDao {

    @Query("SELECT * FROM news")
    suspend fun getNews(): List<NewsItem>
}
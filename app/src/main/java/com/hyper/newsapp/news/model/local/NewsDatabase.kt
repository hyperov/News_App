package com.hyper.newsapp.news.model.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hyper.newsapp.news.model.response.NewsItem
import com.hyper.newsapp.sources.model.response.SourceItem

@Database(
    entities = [NewsItem::class, SourceItem::class],
    version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao
}
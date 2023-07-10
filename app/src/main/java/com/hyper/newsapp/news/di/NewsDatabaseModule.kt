package com.hyper.newsapp.news.di

import android.content.Context
import androidx.room.Room
import com.hyper.newsapp.news.model.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NewsDatabaseModule {


    @Provides
    fun getDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "database-news"
        ).fallbackToDestructiveMigration().build()
    }
}
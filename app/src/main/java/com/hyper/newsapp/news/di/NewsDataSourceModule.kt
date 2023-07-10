package com.hyper.newsapp.news.di

import com.hyper.newsapp.news.model.repo.NewsDataSource
import com.hyper.newsapp.news.model.repo.NewsDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class NewsDataSourceModule {

    @Binds
    abstract fun provideNewsDataSourceModule(repo: NewsDataSourceImpl): NewsDataSource

}
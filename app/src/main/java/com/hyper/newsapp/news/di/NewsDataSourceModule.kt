package com.hyper.newsapp.news.di

import com.hyper.newsapp.news.model.local.NewsLocalDataSource
import com.hyper.newsapp.news.model.local.NewsLocalDataSourceImpl
import com.hyper.newsapp.news.model.remote.NewsRemoteDataSource
import com.hyper.newsapp.news.model.remote.NewsRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class NewsDataSourceModule {

    @Binds
    abstract fun provideRemoteNewsDataSourceModule(remoteDataSource: NewsRemoteDataSourceImpl): NewsRemoteDataSource

    @Binds
    abstract fun provideLocalNewsDataSourceModule(localDataSource: NewsLocalDataSourceImpl): NewsLocalDataSource

}
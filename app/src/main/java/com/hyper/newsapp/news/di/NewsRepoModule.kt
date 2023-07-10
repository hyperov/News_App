package com.hyper.newsapp.news.di

import com.hyper.newsapp.news.model.main.NewsRepo
import com.hyper.newsapp.news.model.main.NewsRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class NewsRepoModule {

    @Binds
    abstract fun provideRepoModule(newsRepo: NewsRepoImpl): NewsRepo

}
package com.hyper.newsapp.news.model.main

import com.hyper.newsapp.news.model.NewsRepoModel
import com.hyper.newsapp.news.model.local.NewsLocalDataSource
import com.hyper.newsapp.news.model.remote.NewsRemoteDataSource
import com.hyper.newsapp.news.model.response.toNewsRepoModel
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class NewsRepoImpl @Inject constructor(
    private val localDataSource: NewsLocalDataSource,
    private val remoteDataSource: NewsRemoteDataSource
) : NewsRepo {

    @OptIn(FlowPreview::class)
    override suspend fun getNews(offset: Int, isOnline: Boolean): Flow<NewsRepoModel> {
        return if (isOnline) {
            remoteDataSource.getNews(offset)
                .flatMapConcat { newsResponse ->
                    flowOf(newsResponse.toNewsRepoModel())
                }
        } else {
            localDataSource.getNews(offset).flatMapConcat { newsList ->
                flowOf(NewsRepoModel(newsList))
            }
        }
    }

}
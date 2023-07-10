package com.hyper.newsapp.news.model.remote

import com.hyper.newsapp.BuildConfig
import com.hyper.newsapp.news.model.response.NewsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRemoteDataSourceImpl @Inject constructor(private val newsApi: NewsApi) :
    NewsRemoteDataSource {

    override suspend fun getNews(offset: Int): Flow<NewsResponse> {
        return flow {
            emit(
                newsApi.getAllNews(
                    BuildConfig.MEDIA_STACK_API_KEY,
                    20,
                    offset
                )
            )
        }

    }
}
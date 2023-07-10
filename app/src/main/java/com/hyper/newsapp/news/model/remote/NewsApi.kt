package com.hyper.newsapp.news.model.remote

import com.hyper.newsapp.news.model.response.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("news")
    suspend fun getAllNews(
        @Query("access_key") accessKey: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): NewsResponse

}


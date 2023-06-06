package com.hyper.newsapp.sources.model

import com.hyper.newsapp.sources.model.response.SourcesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface SourcesApi {

    @GET("sources")
    suspend fun getAllSources(@Query("access_key") accessKey: String): SourcesResponse

}


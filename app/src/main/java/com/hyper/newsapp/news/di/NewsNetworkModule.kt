package com.hyper.newsapp.news.di

import android.content.Context
import com.hyper.newsapp.BuildConfig
import com.hyper.newsapp.news.model.repo.NewsApi
import com.hyper.newsapp.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit


@Module
@InstallIn(SingletonComponent::class)
object NewsNetworkModule {

    @Provides
    fun getRetrofitInstance(@ApplicationContext context: Context): NewsApi {

        var client = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            client.addInterceptor(interceptor)
        }

        client = client.connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create()
    }

}
package com.hyper.newsapp.common

import com.hyper.newsapp.news.model.response.Context

data class Error(
    val code: String,
    val context: Context,
    val message: String
)
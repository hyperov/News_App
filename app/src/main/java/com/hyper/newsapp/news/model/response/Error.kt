package com.hyper.newsapp.news.model.response

data class Error(
    val code: String,
    val context: Context,
    val message: String
)
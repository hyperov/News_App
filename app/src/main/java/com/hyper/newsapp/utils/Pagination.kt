package com.hyper.newsapp.utils

data class Pagination(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val total: Int
)
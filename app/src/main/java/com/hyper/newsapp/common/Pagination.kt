package com.hyper.newsapp.common

data class Pagination(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val total: Int
)
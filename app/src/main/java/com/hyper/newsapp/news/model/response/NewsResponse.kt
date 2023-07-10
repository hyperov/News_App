package com.hyper.newsapp.news.model.response

import com.hyper.newsapp.common.ParentResponse

data class NewsResponse(
    val `data`: List<Data>,
) : ParentResponse()
package com.hyper.newsapp.news.model.response

import com.hyper.newsapp.utils.Pagination
import com.hyper.newsapp.utils.ParentResponse

data class NewsResponse(
    val `data`: List<Data>,
) : ParentResponse()
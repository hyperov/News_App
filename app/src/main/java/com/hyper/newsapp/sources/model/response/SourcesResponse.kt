package com.hyper.newsapp.sources.model.response

import com.hyper.newsapp.utils.ParentResponse

data class SourcesResponse(
    val data: List<Data>
) : ParentResponse()
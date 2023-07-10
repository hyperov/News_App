package com.hyper.newsapp.sources.model.response

import com.hyper.newsapp.common.ParentResponse

data class SourcesResponse(
    val data: List<Data>
) : ParentResponse()
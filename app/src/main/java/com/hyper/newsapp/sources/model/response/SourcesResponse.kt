package com.hyper.newsapp.sources.model.response

import com.google.gson.annotations.SerializedName
import com.hyper.newsapp.common.ParentResponse

data class SourcesResponse(
    @field:SerializedName("data")
    val news: List<SourceItem>
) : ParentResponse()
package com.hyper.newsapp.sources.model.response

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sources")
data class SourceItem(
    val category: String,
    val country: String,
    @PrimaryKey val id: String,
    val language: String,
    val name: String,
    val url: String
)
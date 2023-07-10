package com.hyper.newsapp.common

sealed interface ResourceState {
    object EMPTY : ResourceState
    object LOADING : ResourceState
    object SUCCESS : ResourceState
    object ERROR : ResourceState
}
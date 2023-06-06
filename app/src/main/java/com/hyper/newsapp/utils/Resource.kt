package com.hyper.newsapp.utils

sealed class Resource<T>(
    val state: ResourceState,
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(ResourceState.SUCCESS, data)
    class Error<T>(message: String) : Resource<T>(ResourceState.ERROR, message = message)
    class Loading<T> : Resource<T>(ResourceState.LOADING)
    class Empty<T> : Resource<T>(ResourceState.EMPTY)
}
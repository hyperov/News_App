package com.hyper.newsapp.news.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hyper.newsapp.common.Resource
import com.hyper.newsapp.news.model.NewsRepoModel
import com.hyper.newsapp.news.model.main.NewsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepo: NewsRepo) : ViewModel() {

    private val _isOnlineStateFlow = MutableStateFlow(true)

    private val _newsStateFlow = MutableStateFlow<Resource<NewsRepoModel>>(
        Resource.Empty()
    )
    val newsStateFlow = _newsStateFlow.asStateFlow()

    fun getNews() {
        viewModelScope.launch {

            newsRepo.getNews(0, _isOnlineStateFlow.value)
                .onStart { _newsStateFlow.value = Resource.Loading() }
                .catch { _newsStateFlow.value = Resource.Error(it.message!!) }
                .collectLatest { newsRepoModel ->
                    if (!newsRepoModel.error.isNullOrEmpty())
                        _newsStateFlow.value = Resource.Error(newsRepoModel.error)
                    else {
                        _newsStateFlow.value = Resource.Success(newsRepoModel)
                    }
                }
        }
    }
}
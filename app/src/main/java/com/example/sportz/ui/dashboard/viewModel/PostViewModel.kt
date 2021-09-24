package com.example.sportz.ui.dashboard.viewModel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportz.ui.dashboard.repository.PostRepository
import com.example.sportz.model.DataResponse
import com.example.sportz.model.Players
import com.example.sportz.model._4
import com.example.sportz.model._5
import com.example.sportz.ui.dashboard.model.PlayerModel
import com.example.sportz.ui.dashboard.repository.LocalDataRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class PostViewModel @ViewModelInject constructor(
        private val postRepository: PostRepository,
        private val localDataRepository: LocalDataRepository
)  : ViewModel(){
    val postLiveData = MutableLiveData<DataResponse?>()
    val searchResult = MutableLiveData<List<PlayerModel>>()

    fun getPost(){
        viewModelScope.launch {
            postRepository.getPost()
                .catch { e ->
                    Log.d("main", "getPost: ${e.message}")
                }.collect {
                  postLiveData.value = it
                }
        }
    }

    fun Team1(list: List<PlayerModel>) = viewModelScope.launch {
        localDataRepository.Teams(list)
    }

    fun searchByTeam(search: String) = CoroutineScope(Dispatchers.IO).launch{
        val list : List<PlayerModel> = localDataRepository.getSearchedTeams(search)
        searchResult.postValue(list)
    }

  /*  fun Team2(list: List<Players>) = viewModelScope.launch {
        localDataRepository.Team2(list)
    }*/
}
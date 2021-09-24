package com.example.sportz.ui.dashboard.repository

import com.example.sportz.db.daos.AppDao
import com.example.sportz.di.ApiService
import com.example.sportz.model.DataResponse
import com.example.sportz.model._4
import com.example.sportz.model._5
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val apiService: ApiService
    ) {

    suspend fun getPost() : Flow<DataResponse> = flow {
        val response= apiService.getPosts()
        emit(response)
    }.flowOn(Dispatchers.IO)

}
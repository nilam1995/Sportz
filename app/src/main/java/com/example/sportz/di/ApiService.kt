package com.example.sportz.di

import com.example.sportz.di.utils.Constants
import com.example.sportz.model.DataResponse
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.DataList)
   suspend fun getPosts() : DataResponse
}
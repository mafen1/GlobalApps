package com.example.globalapps.data.api

import com.example.globalapps.data.models.ResponseActivity
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Inject

interface ApiService {

    @GET("/api/activity/")
    suspend fun fetchActivity(): Response<ResponseActivity>

    class ApiServiceImpl @Inject constructor(): ApiService{
        override suspend fun fetchActivity(): Response<ResponseActivity> {
            return ApiClient.apiService().fetchActivity()
        }

    }
}
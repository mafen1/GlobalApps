package com.example.globalapps.data.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/api/activity/")
    suspend fun fetchActivity(): Response<>
}
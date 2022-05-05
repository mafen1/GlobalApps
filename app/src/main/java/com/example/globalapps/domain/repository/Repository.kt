package com.example.globalapps.domain.repository

import com.example.globalapps.data.api.ApiService
import com.example.globalapps.data.models.ResponseActivity
import retrofit2.Response

interface Repository {

    suspend fun fetchActivity(): Response<ResponseActivity>

}
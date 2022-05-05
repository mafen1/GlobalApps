package com.example.globalapps.data.repository

import com.example.globalapps.data.api.ApiService
import com.example.globalapps.data.models.ResponseActivity
import com.example.globalapps.domain.repository.Repository
import retrofit2.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: ApiService): Repository {

    override suspend fun fetchActivity(): Response<ResponseActivity> = apiService.fetchActivity()

}
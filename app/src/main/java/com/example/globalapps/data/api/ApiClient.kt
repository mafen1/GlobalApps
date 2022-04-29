package com.example.globalapps.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val baseUrl = "http://www.boredapi.com"
    private var retrofit: Retrofit? = null

    private fun getClient(baseUrl: String): Retrofit{
        if (retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }

    fun apiService() = getClient(baseUrl).create(ApiService::class.java)

}
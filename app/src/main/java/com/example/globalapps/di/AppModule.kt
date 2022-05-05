package com.example.globalapps.di

import com.example.globalapps.data.api.ApiService
import com.example.globalapps.data.repository.RepositoryImpl
import com.example.globalapps.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindApiService(apiService: ApiService.ApiServiceImpl): ApiService

    @Binds
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}
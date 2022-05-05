package com.example.globalapps.domain.useCase

import com.example.globalapps.data.repository.RepositoryImpl
import javax.inject.Inject

class UseCase @Inject constructor(private val repositoryImpl: RepositoryImpl) {

    suspend fun getActivity() = repositoryImpl.fetchActivity()

}
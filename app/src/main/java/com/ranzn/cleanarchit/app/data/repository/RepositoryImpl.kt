package com.ranzn.cleanarchit.app.data.repository

import com.ranzn.cleanarchit.app.data.model.ResponseModel
import com.ranzn.cleanarchit.app.data.remote.ApiClient
import com.ranzn.cleanarchit.common.NetworkResult
import com.ranzn.cleanarchit.app.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryImpl(private val apiClient: ApiClient) : Repository {
    override fun getData(): Flow<NetworkResult<ResponseModel>> =
        flow {
            emit(NetworkResult.Loading())
            try {
                emit(NetworkResult.Success(apiClient.getData()))
            } catch (e: Exception) {
                emit(NetworkResult.Error(e.localizedMessage))
            }
        }

    override fun getAnotherData(pg: Int): Flow<NetworkResult<ResponseModel>> =
        flow {
            emit(NetworkResult.Loading())
            try {
                emit(NetworkResult.Success(apiClient.getData(pgNo = pg)))
            } catch (e: Exception) {
                emit(NetworkResult.Error(e.localizedMessage))
            }
        }
}
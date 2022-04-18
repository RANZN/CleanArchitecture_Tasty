package com.ranzn.cleanarchit.app.domain.repository

import com.ranzn.cleanarchit.app.data.model.ResponseModel
import com.ranzn.cleanarchit.common.NetworkResult
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getData(): Flow<NetworkResult<ResponseModel>>
    fun getAnotherData(pgNo: Int): Flow<NetworkResult<ResponseModel>>
}
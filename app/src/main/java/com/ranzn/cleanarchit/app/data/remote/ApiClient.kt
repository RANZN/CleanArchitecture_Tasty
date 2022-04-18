package com.ranzn.cleanarchit.app.data.remote

import com.ranzn.cleanarchit.BuildConfig.HEADER_KEY
import com.ranzn.cleanarchit.app.data.model.ResponseModel
import com.ranzn.cleanarchit.common.Constants.HEADER_HOST
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiClient {
    @GET("feeds/list")
    suspend fun getData(
        @Header("x-rapidapi-host") host: String = HEADER_HOST,
        @Header("x-rapidapi-key") key: String = HEADER_KEY,
        @Query("from") pgNo: Int = 0
    ): ResponseModel

}
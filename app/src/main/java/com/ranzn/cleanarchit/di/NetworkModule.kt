package com.ranzn.cleanarchit.di

import com.ranzn.cleanarchit.app.data.remote.ApiClient
import com.ranzn.cleanarchit.common.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single {
        val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(get<GsonConverterFactory>())
            .client(get<OkHttpClient>())
        return@single builder.build()
    }

    single {
        return@single GsonConverterFactory.create()
    }

    single {
        return@single OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.MINUTES)
            .readTimeout(10, TimeUnit.MINUTES)
            .writeTimeout(10, TimeUnit.MINUTES)
            .addInterceptor(get<HttpLoggingInterceptor>())
            .build()
    }

    single {
        return@single HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    single {
        return@single get<Retrofit>().create(ApiClient::class.java)
    }
}
package com.ranzn.cleanarchit.di

import com.ranzn.cleanarchit.app.data.repository.RepositoryImpl
import com.ranzn.cleanarchit.app.domain.repository.Repository
import com.ranzn.cleanarchit.app.domain.use_cases.GetAnotherData
import com.ranzn.cleanarchit.app.domain.use_cases.GetData
import com.ranzn.cleanarchit.app.domain.use_cases.UseCases
import org.koin.dsl.module

val appModule = module {
    single<Repository> { RepositoryImpl(get()) }

    single { UseCases(get(),get()) }
    single { GetData(get()) }
    single { GetAnotherData(get()) }
}
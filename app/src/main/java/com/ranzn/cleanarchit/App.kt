package com.ranzn.cleanarchit

import android.app.Application
import com.ranzn.cleanarchit.di.appModule
import com.ranzn.cleanarchit.di.networkModule
import com.ranzn.cleanarchit.di.viewModelModule
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule, viewModelModule, networkModule)
        }
    }
}
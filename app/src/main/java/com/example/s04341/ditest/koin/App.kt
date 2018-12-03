package com.example.s04341.ditest.koin

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(
            this, listOf(
                this.firstRepositoryModule,
                this.firstViewModelModule
            )
        )
    }

    //ここのインスタンスを変えるだけで抽象元を変えられる
    private val firstRepositoryModule: Module = applicationContext {
        factory { SecondRepository() as FirstRepositoryContract }
    }

    private val firstViewModelModule: Module = applicationContext {
        factory { FirstViewModel(get()) as FirstViewModelContract }
    }
}
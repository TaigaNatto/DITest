package com.example.s04341.ditest.multiadapter_with_koin

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

class App :Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin(
            this, listOf(
                this.itemModule
            )
        )
    }

    //ここのインスタンスを変えるだけで抽象元を変えられる
    private val itemModule: Module = applicationContext {
        factory("normal") { NormalItem() as ItemContract }
        //factory("sp") { SpecialItem() as ItemContract }
    }
}
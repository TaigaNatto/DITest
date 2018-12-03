package com.example.s04341.ditest.dagger2

import android.app.Application

class App : Application() {
    private lateinit var appComponent: AppComponent

    fun getComponent(): AppComponent {
        return appComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .modelModule(ModelModule("Success!"))
            .build()
    }
}
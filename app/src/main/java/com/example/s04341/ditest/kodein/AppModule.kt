package com.example.s04341.ditest.kodein

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.instance

class AppModule {

    fun appModule(app:Application)=Kodein.Module{
        bind<Application>() with instance(app)
    }
}
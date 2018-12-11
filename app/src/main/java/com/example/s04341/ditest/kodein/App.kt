package com.example.s04341.ditest.kodein

import android.app.Application
import com.github.salomonbrys.kodein.*

class App : Application(), KodeinAware {

    override val kodein:Kodein by Kodein.lazy{
        bind<FirstRepository>() with instance(FirstRepository())
        bind<FirstViewModel>() with instance(FirstViewModel(instance()))
    }
}
package com.example.s04341.ditest.kodein

import android.app.Application
import com.github.salomonbrys.kodein.*

class App : Application(), KodeinAware {

    val firstRepositoryModule = Kodein.Module {
        bind<FirstRepository>() with instance(FirstRepository())
    }
    val firstViewModelModule = Kodein.Module {
        bind<FirstViewModel>() with instance(FirstViewModel(FirstRepository()))
    }

    override val kodein:Kodein by Kodein.lazy{

    }
}
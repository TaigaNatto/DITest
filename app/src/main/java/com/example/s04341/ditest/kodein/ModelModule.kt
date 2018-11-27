package com.example.s04341.ditest.kodein

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.instance

class ModelModule {
    fun modelModule(text: String) = Kodein.Module {
        bind<String>() with instance(text)
    }
}
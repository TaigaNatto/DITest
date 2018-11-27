package com.example.s04341.ditest.kodein

import android.app.Application
import com.example.s04341.ditest.dagger2.DaggerAppComponent
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.lazy
import com.github.salomonbrys.kodein.singleton

class App:Application(),KodeinAware {
    override val kodein: Kodein by Kodein.lazy{
        import(AppModule().appModule(this@App))
    }
}
package com.example.s04341.ditest.dagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AppModule::class,
    ModelModule::class)
)
interface AppComponent{
    fun inject(activity: FirstActivity)
}
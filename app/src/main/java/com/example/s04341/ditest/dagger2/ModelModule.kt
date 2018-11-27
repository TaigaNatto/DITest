package com.example.s04341.ditest.dagger2

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ModelModule(private val text:String) {
    @Singleton
    @Provides
    fun provideFirstViewModel():FirstViewModel{
        return FirstViewModel(text)
    }
}
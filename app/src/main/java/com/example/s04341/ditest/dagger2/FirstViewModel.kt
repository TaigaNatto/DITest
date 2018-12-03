package com.example.s04341.ditest.dagger2

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.Observable
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirstViewModel @Inject constructor(private val text: String) : BaseObservable() {

    @Bindable
    fun getText(): String {
        return this.text
    }
}
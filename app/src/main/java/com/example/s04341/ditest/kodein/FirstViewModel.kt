package com.example.s04341.ditest.kodein

import android.databinding.BaseObservable
import android.databinding.Bindable

class FirstViewModel(private val text: String):BaseObservable(){

    @Bindable
    fun getText(): String {
        return this.text
    }
}
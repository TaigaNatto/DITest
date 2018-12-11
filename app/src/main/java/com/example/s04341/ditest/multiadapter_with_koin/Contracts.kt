package com.example.s04341.ditest.multiadapter_with_koin

import android.content.Context
import android.view.View

interface ItemContract {
    fun getView(context: Context): View
}
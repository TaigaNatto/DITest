package com.example.s04341.ditest.multiadapter_with_koin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.example.s04341.ditest.R

class NormalItem :ItemContract {
    override fun getViewResource(): Int {
        return R.layout.layout_normal
    }
}
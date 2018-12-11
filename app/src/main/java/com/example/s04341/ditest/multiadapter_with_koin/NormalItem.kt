package com.example.s04341.ditest.multiadapter_with_koin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.example.s04341.ditest.R

class NormalItem :ItemContract {
    override fun getView(context: Context): View {
        val inflater=LayoutInflater.from(context)
        return inflater.inflate(R.layout.layout_normal,null)
    }
}
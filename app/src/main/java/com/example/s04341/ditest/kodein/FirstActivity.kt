package com.example.s04341.ditest.kodein

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.s04341.ditest.R
import com.example.s04341.ditest.databinding.ActivityFirstKodeinBinding
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.android.KodeinAppCompatActivity
import com.github.salomonbrys.kodein.android.appKodein
import com.github.salomonbrys.kodein.instance

class FirstActivity : KodeinAppCompatActivity() {

    private val mBinding: ActivityFirstKodeinBinding by lazy {
        DataBindingUtil.setContentView<ActivityFirstKodeinBinding>(this, R.layout.activity_first_kodein)
    }

    private val viewModel: FirstViewModel by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        mBinding.viewModel = viewModel
    }
}

package com.example.s04341.ditest.dagger2

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.s04341.ditest.R
import com.example.s04341.ditest.databinding.ActivityFirstBinding
import javax.inject.Inject

class FirstActivity : AppCompatActivity() {

    private val mBinding:ActivityFirstBinding by lazy {
        DataBindingUtil.setContentView<ActivityFirstBinding>(this,R.layout.activity_first)
    }

    @Inject lateinit var viewModel: FirstViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        (application as App).getComponent().inject(this)

        mBinding.viewModel=viewModel
    }
}

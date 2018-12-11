package com.example.s04341.ditest.koin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.s04341.ditest.R
import com.example.s04341.ditest.databinding.ActivityFirstKoinBinding
import org.koin.android.ext.android.inject

class FirstActivity : AppCompatActivity() {

    private val mBinding: ActivityFirstKoinBinding by lazy {
        DataBindingUtil.setContentView<ActivityFirstKoinBinding>(this, R.layout.activity_first_koin)
    }

    private val viewModel: FirstViewModelContract by inject()

    private val viewRepository:FirstRepositoryContract by inject("first")
    private val viewRepository2:FirstRepositoryContract by inject("second")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        mBinding.viewModel = this.viewModel as FirstViewModel

        Toast.makeText(this,"${viewRepository.getText()}\n${viewRepository2.getText()}",Toast.LENGTH_LONG).show()
    }
}

package com.example.s04341.ditest.kodein

class FirstViewModel(private val firstRepo: FirstRepositoryContract) : FirstViewModelContract {
    override fun getText(): String {
        return firstRepo.getText()
    }
}
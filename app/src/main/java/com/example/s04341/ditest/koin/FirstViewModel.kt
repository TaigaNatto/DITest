package com.example.s04341.ditest.koin

class FirstViewModel
constructor(private val firstRepo: FirstRepositoryContract) : FirstViewModelContract {
    override fun getText(): String {
        return this.firstRepo.getText()
    }
}
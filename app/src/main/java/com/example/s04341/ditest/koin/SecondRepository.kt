package com.example.s04341.ditest.koin

class SecondRepository : FirstRepositoryContract {
    override fun getText(): String {
        return "Success Koin from SecondRepo !"
    }
}
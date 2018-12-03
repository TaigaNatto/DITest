package com.example.s04341.ditest.koin

class FirstRepository : FirstRepositoryContract {
    override fun getText(): String {
        return "Success Koin from FirstRepo !"
    }
}
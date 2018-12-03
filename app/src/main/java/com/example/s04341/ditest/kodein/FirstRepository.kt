package com.example.s04341.ditest.kodein

class FirstRepository : FirstRepositoryContract {
    override fun getText(): String {
        return "Success Kodein from FirstRepo !"
    }
}
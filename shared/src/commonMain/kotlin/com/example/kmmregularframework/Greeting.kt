package com.example.kmmregularframework

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!  ${Platform().randomText}"
    }
}
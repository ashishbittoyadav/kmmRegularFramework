package com.example.kmmregularframework

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    actual val randomText: String
        get() = "random data for testing."
}
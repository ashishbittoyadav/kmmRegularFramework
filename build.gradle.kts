buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.android.tools.build:gradle:7.2.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

group = "com.example.kmmRegularFramework"
version = "1.0.0"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
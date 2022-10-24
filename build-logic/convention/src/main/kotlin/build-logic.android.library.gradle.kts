@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    id("build-logic.android.base")
}

android {
    buildFeatures {
        buildConfig = false
    }
}

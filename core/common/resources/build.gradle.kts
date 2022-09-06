plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    defaultConfig {
        resValue("string", "app_name", extra["xero.project.name"] as String)
    }
    buildFeatures {
        buildConfig = false
    }
}

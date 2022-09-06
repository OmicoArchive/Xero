plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    buildFeatures {
        buildConfig = false
    }
}

dependencies {
    api(projects.core.common.resources)
}

dependencies {
    api(androidx.activity.ktx)
    api(androidx.annotation)
    api(androidx.core.ktx)
    api(androidx.lifecycle.runtime.ktx)
    api(kotlinx.coroutines.android)
}
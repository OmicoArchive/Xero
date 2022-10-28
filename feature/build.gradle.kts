plugins {
    id("build-logic.android.library")
    id("build-logic.android.compose")
}

android {
    buildFeatures {
        androidResources = false
    }
}

dependencies {
    implementation(projects.feature.main)
}

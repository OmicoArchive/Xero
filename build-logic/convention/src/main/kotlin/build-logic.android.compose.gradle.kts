@file:Suppress("UnstableApiUsage")

import me.omico.age.dsl.configureAndroidCommon

configureAndroidCommon {
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versions.androidx.compose.compiler
    }
}

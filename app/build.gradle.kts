plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    defaultConfig {
        versionCode = extra["xero.project.version.code"].toString().toInt()
        versionName = extra["xero.project.version.name"] as String
    }
    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
            signingConfig = signingConfigs.findByName("release")
        }
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(projects.ui)
}

plugins {
    id("build-logic.android.application")
    id("build-logic.android.compose")
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
        }
    }
}

dependencies {
    implementation(projects.core)
    implementation(projects.feature)
}

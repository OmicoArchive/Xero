@file:Suppress("UnstableApiUsage")

import me.omico.age.dsl.configureAndroidCommon

plugins {
    id("com.android.base")
    kotlin("android")
}

configureAndroidCommon {
    namespace = androidNamespace
    compileSdk = 33
    buildToolsVersion = "33.0.0"
    defaultConfig {
        minSdk = 26
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

val Project.androidNamespace
    get() = path.replace(":", ".")
        .let { if (it == ".app") "" else it.replace("-", ".") }
        .let { extra["xero.project.group"] as String + it }

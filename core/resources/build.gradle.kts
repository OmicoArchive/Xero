plugins {
    id("build-logic.android.library")
}

android {
    defaultConfig {
        resValue("string", "app_name", extra["xero.project.name"] as String)
    }
}

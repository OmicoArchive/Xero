plugins {
    id("build-logic.android.library")
    id("build-logic.android.compose")
}

dependencies {
    api(projects.core.ui.theme)
}

dependencies {
    api(platform(androidx.compose.bom))
}

dependencies {
    api(accompanist.swipeRefresh)
    api(accompanist.systemUiController)
    api(androidx.activity.compose)
    api(androidx.compose.animation)
    api(androidx.compose.foundation)
    api(androidx.compose.material.icons.core)
    api(androidx.compose.material.icons.extended)
    api(androidx.compose.material3)
    api(androidx.compose.material3.windowSizeClass)
    api(androidx.compose.runtime)
    api(androidx.compose.ui)
    api(androidx.compose.ui.tooling.preview)
    api(androidx.compose.ui.util)
    api(androidx.navigation.compose)
    api(androidx.navigation.runtime.ktx)
    debugApi(androidx.compose.ui.tooling)
}

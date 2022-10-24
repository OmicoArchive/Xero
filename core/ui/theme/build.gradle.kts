plugins {
    id("build-logic.android.library")
    id("build-logic.android.compose")
}

dependencies {
    api(projects.core.resources)
}

dependencies {
    api(androidx.core.splashScreen)
    api(material)
    compileOnly(accompanist.systemUiController)
    compileOnly(androidx.compose.material3)
}

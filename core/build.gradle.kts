plugins {
    id("build-logic.android.library")
}

dependencies {
    api(projects.core.resources)
    api(projects.core.ui)
    api(projects.core.data.repository)
    implementation(projects.core.data)
}

dependencies {
    api(androidx.activity.ktx)
    api(androidx.annotation)
    api(androidx.core.ktx)
    api(androidx.lifecycle.runtime.ktx)
    api(kotlinx.coroutines.android)
}

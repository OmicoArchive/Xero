plugins {
    id("build-logic.android.library")
}

dependencies {
    api(projects.core.common)
    api(projects.core.resources)
    api(projects.core.ui)
    api(projects.core.data.repository)
    implementation(projects.core.data)
}

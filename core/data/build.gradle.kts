plugins {
    id("build-logic.android.library")
}

dependencies {
    implementation(projects.core.data.common)
    implementation(projects.core.data.repository)
}

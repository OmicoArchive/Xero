plugins {
    id("build-logic.android.library")
}

dependencies {
    implementation(projects.core.data.common)
    implementation(projects.core.data.database)
    implementation(projects.core.data.datastore)
    implementation(projects.core.data.repository)
}

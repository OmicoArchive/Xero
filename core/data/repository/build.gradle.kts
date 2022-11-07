plugins {
    id("build-logic.android.library")
}

dependencies {
    api(projects.core.data.common)
    implementation(projects.core.data.repository.database)
    implementation(projects.core.data.repository.datastore)
}

plugins {
    id("build-logic.android.library")
}

dependencies {
    api(androidx.activity.ktx)
    api(androidx.annotation)
    api(androidx.core.ktx)
    api(androidx.lifecycle.runtime.ktx)
    api(kotlinx.coroutines.android)
}

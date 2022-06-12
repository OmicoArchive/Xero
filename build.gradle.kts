import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import me.omico.age.dsl.configureAndroidCommon
import me.omico.age.dsl.configureAppSigningConfigsForRelease
import me.omico.age.dsl.kotlinCompile
import me.omico.age.spotless.androidXml
import me.omico.age.spotless.configureSpotless
import me.omico.age.spotless.intelliJIDEARunConfiguration
import me.omico.age.spotless.kotlin
import me.omico.age.spotless.kotlinGradle

plugins {
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("com.diffplug.spotless")
    id("com.github.ben-manes.versions")
    id("me.omico.age.project")
    id("me.omico.age.spotless")
    kotlin("android") apply false
}

allprojects {
    configureDependencyUpdates()
    configureSpotless {
        androidXml()
        intelliJIDEARunConfiguration()
        kotlin()
        kotlinGradle()
    }
    configureAppSigningConfigsForRelease()
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
        composeOptions {
            kotlinCompilerExtensionVersion = versions.androidx.compose.compiler
        }
    }
    kotlinCompile {
        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs = listOf(
                "-Xcontext-receivers",
            )
        }
    }
}

val wrapper: Wrapper by tasks.named<Wrapper>("wrapper") {
    gradleVersion = versions.gradle
    distributionType = Wrapper.DistributionType.BIN
}

fun Project.configureDependencyUpdates() {
    apply(plugin = "com.github.ben-manes.versions")
    tasks.withType<DependencyUpdatesTask> {
        val stableList = listOf(
            "org.jetbrains.kotlin",
            "org.jetbrains.kotlinx",
        )
        rejectVersionIf {
            when {
                stableList.contains(candidate.group) -> isNonStable(candidate.version)
                else -> false
            }
        }
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}

val Project.androidNamespace
    get() = path.replace(":", ".")
        .let { if (it == ".app") "" else it.replace("-", ".") }
        .let { extra["xero.project.group"] as String + it }

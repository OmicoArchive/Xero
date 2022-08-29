@file:Suppress("UnstableApiUsage")

import me.omico.age.dsl.ageSnapshots
import me.omico.age.dsl.gradmSnapshots
import me.omico.age.dsl.spotless
import org.gradle.api.internal.FeaturePreviews

plugins {
    id("me.omico.age.settings.initialization")
}

FeaturePreviews.Feature.values()
    .filter { it.isActive }
    .forEach { enableFeaturePreview(it.name) }

pluginManagement {
    repositories {
        ageSnapshots()
        google()
        gradmSnapshots()
        mavenCentral()
        spotless()
    }
}

dependencyResolutionManagement {
    repositories {
        ageSnapshots()
        google()
        gradmSnapshots()
        mavenCentral()
        spotless()
    }
}

buildCache {
    local {
        removeUnusedEntriesAfterDays = 1
    }
}

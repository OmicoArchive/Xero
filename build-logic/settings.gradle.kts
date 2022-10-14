@file:Suppress("UnstableApiUsage")

rootProject.name = "build-logic"

pluginManagement {
    includeBuild("gradm")
    includeBuild("initialization")
    repositories {
        mavenCentral()
        maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
}

plugins {
    id("gradm")
    id("initialization")
}

include(":convention")

@file:Suppress("UnstableApiUsage")

rootProject.name = extra["xero.project.name"] as String

pluginManagement {
    includeBuild("build-logic")
    includeBuild("build-logic/gradm")
    includeBuild("build-logic/initialization")
    repositories {
        gradlePluginPortal {
            content {
                includeGroupByRegex("com.gradle.*")
            }
        }
        mavenCentral()
        maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
}

plugins {
    id("gradm")
    id("initialization")
    id("com.gradle.enterprise") version "3.11.1"
    id("me.omico.age.settings") version "1.0.0-SNAPSHOT"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlwaysIf(!gradle.startParameter.isOffline)
    }
}

include(":android")
include(":core")
include(":core:resources")
include(":core:ui")
include(":core:ui:theme")
include(":feature")
include(":feature:main")

moduleStructure {
    name = extra["xero.project.name"] as String
    group = extra["xero.project.group"] as String
    sourceType = "kotlin"
    folder("core") {
        template = "android-library"
        module("data")
        folder("data") {
            module("common")
            module("database")
            module("datastore")
            module("repository")
        }
    }
    folder("feature") {
        template = "android-feature"
        module("template")
    }
}

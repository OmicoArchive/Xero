@file:Suppress("UnstableApiUsage")

import me.omico.age.settings.folder
import me.omico.age.settings.group
import me.omico.age.settings.module
import me.omico.age.settings.moduleStructure
import me.omico.age.settings.name
import me.omico.age.settings.sourceType
import me.omico.age.settings.template

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

include(":app")
include(":core")
include(":core:resources")
include(":core:ui")
include(":core:ui:theme")
include(":data")
include(":ui")
include(":ui:main")

moduleStructure {
    name = extra["xero.project.name"] as String
    group = extra["xero.project.group"] as String
    sourceType = "kotlin"
    folder("ui") {
        template = "android-ui-feature"
        module("template")
    }
}

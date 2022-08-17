@file:Suppress("UnstableApiUsage")

import me.omico.age.settings.folder
import me.omico.age.settings.group
import me.omico.age.settings.module
import me.omico.age.settings.moduleStructure
import me.omico.age.settings.name
import me.omico.age.settings.sourceType
import me.omico.age.settings.template

rootProject.name = extra["xero.project.name"] as String

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        mavenLocal()
        maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

buildscript {
    configurations.all {
        resolutionStrategy.cacheChangingModulesFor(0, TimeUnit.SECONDS)
    }
}

plugins {
    id("com.gradle.enterprise") version "3.10.3"
    id("me.omico.age.settings") version "1.0.0-SNAPSHOT"
    id("me.omico.gradm") version "2.5.0-SNAPSHOT"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
    }
}

gradm {
    configs {
        format = true
    }
}

include(":app")
include(":data")
include(":ui")
include(":ui:common")
include(":ui:common:resources")
include(":ui:common:theme")
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

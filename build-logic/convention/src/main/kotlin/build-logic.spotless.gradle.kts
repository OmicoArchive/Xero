import me.omico.age.spotless.configureSpotless
import me.omico.age.spotless.intelliJIDEARunConfiguration
import me.omico.age.spotless.kotlin
import me.omico.age.spotless.kotlinGradle

plugins {
    id("build-logic.root-project.base")
    id("com.diffplug.spotless")
    id("me.omico.age.spotless")
}

allprojects {
    configureSpotless {
        intelliJIDEARunConfiguration()
        kotlin(
            editorConfig = mapOf(
                "disabled_rules" to listOf(
                    "argument-list-wrapping",
                    "filename",
                ).joinToString(","),
                "ij_kotlin_allow_trailing_comma" to "true",
                "ij_kotlin_allow_trailing_comma_on_call_site" to "true",
            ),
            licenseHeaderFile = rootProject.file("spotless/copyright.kt").takeIf(File::exists),
            licenseHeaderConfig = {
                updateYearWithLatest(true)
                yearSeparator("-")
            },
        )
        kotlinGradle(
            additionalExcludeTargets = setOf(
                ".gradm/**/*.gradle.kts",
            ),
        )
    }
}

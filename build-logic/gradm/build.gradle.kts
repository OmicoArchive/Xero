plugins {
    id("me.omico.gradm") version "3.0.0-SNAPSHOT"
}

configurations.all {
    resolutionStrategy.cacheChangingModulesFor(0, TimeUnit.SECONDS)
}

gradm {
    pluginId = "gradm"
    debug = true // default: false
    integrations {
        apply("github")
    }
}

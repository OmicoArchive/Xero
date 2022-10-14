plugins {
    id("me.omico.gradm") version "3.0.0-SNAPSHOT"
}

gradm {
    pluginId = "gradm"
    debug = true // default: false
    integrations {
        apply("github")
    }
}

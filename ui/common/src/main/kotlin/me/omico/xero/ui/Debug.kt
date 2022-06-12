package me.omico.xero.ui

import android.content.Context
import android.util.Log
import java.io.File

object AppDebug {

    var debug: Boolean = true
}

fun <T : Any> T?.d(tag: String? = null) {
    val appDebugTag = tag?.let { "AppDebug: $it" } ?: "AppDebug"
    if (AppDebug.debug) Log.e(appDebugTag, toString())
}

inline val <T : Any> T?.d get() = d()

fun Context.writeDebugText(name: String, content: String) {
    File(filesDir, "debug")
        .also { if (!it.exists()) it.mkdirs() }
        .let { File(it, name) }
        .writeText(content)
}

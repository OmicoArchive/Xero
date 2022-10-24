package me.omico.xero.utility

import android.content.Context
import android.util.Log
import java.io.File

object AppDebug {

    var debug: Boolean = true
}

inline fun <reified T : Any> T?.d(tag: String? = null) {
    if (AppDebug.debug) {
        val appDebugTag = tag?.let { "AppDebug: $it" } ?: "AppDebug"
        Log.e(appDebugTag, toString())
    }
}

inline val <reified T : Any> T?.d
    get() = d()

inline fun <reified T : Any> d(tag: String? = null, block: () -> T?) = block().d(tag)

fun Context.writeDebugText(name: String, content: String) =
    File(filesDir, "debug")
        .also { if (!it.exists()) it.mkdirs() }
        .let { File(it, name) }
        .writeText(content)

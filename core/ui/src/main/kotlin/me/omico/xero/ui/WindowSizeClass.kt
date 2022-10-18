package me.omico.xero.ui

import android.app.Activity
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalWindowSizeClass = staticCompositionLocalOf<WindowSizeClass> {
    error("LocalWindowSizeClass value not available.")
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun Activity.ProvideWindowSizeClass(
    windowSizeClass: WindowSizeClass = calculateWindowSizeClass(this),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalWindowSizeClass provides windowSizeClass,
        content = content,
    )
}

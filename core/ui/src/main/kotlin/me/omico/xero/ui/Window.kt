package me.omico.xero.ui

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp

inline val statusBarHeightDp: Dp
    @Composable
    get() = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()

@Composable
fun rememberStatusBarHeightPx(
    density: Density = LocalDensity.current,
    statusBarHeight: Dp = statusBarHeightDp,
): Int = remember(density) { with(density) { statusBarHeight.roundToPx() } }

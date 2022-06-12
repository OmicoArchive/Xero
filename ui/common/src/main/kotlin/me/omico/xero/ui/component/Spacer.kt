package me.omico.xero.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun HeightSpacer(
    height: Dp,
) {
    Spacer(modifier = Modifier.height(height = height))
}

@Composable
fun WidthSpacer(
    width: Dp,
) {
    Spacer(modifier = Modifier.width(width = width))
}

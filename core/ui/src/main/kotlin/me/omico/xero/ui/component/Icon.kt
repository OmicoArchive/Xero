package me.omico.xero.ui.component

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun icon(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    contentDescription: String? = null,
): @Composable () -> Unit = {
    Icon(
        modifier = modifier,
        imageVector = imageVector,
        contentDescription = contentDescription,
    )
}

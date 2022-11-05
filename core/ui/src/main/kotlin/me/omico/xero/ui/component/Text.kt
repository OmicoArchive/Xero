package me.omico.xero.ui.component

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun text(
    modifier: Modifier = Modifier,
    @StringRes id: Int,
): @Composable () -> Unit =
    text(
        modifier = modifier,
        text = stringResource(id = id),
    )

@Composable
fun text(
    modifier: Modifier = Modifier,
    text: String,
): @Composable () -> Unit = {
    Text(
        modifier = modifier,
        text = text,
    )
}

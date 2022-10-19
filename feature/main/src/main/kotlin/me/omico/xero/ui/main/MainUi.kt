package me.omico.xero.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import me.omico.xero.ui.Route

val Route.main: String
    get() = "main"

fun NavGraphBuilder.mainComposable() {
    composable(route = Route.main) {
        MainUi()
    }
}

@Composable
fun MainUi() {
    Box(modifier = Modifier.fillMaxSize())
}

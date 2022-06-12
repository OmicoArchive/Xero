package me.omico.xero.ui.main

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import me.omico.xero.ui.Route
import me.omico.xero.ui.theme.XeroTheme

@Composable
fun XeroApp(
    darkTheme: Boolean = isSystemInDarkTheme(),
) {
    XeroTheme(darkTheme = darkTheme) {
        XeroNavHost()
    }
}

@Composable
private fun XeroNavHost(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Route.main,
    ) {
        mainComposable()
    }
}

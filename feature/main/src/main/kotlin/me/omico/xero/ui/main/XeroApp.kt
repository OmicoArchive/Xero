package me.omico.xero.ui.main

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.navigation.material.BottomSheetNavigator
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import me.omico.xero.ui.Route
import me.omico.xero.ui.theme.XeroTheme

@OptIn(ExperimentalMaterialNavigationApi::class)
@Composable
fun XeroApp(
    darkTheme: Boolean = isSystemInDarkTheme(),
) {
    XeroTheme(darkTheme = darkTheme) {
        XeroNavHost()
    }
}

@OptIn(ExperimentalMaterialNavigationApi::class)
@Composable
private fun XeroNavHost(
    bottomSheetNavigator: BottomSheetNavigator = rememberBottomSheetNavigator(),
    navController: NavHostController = rememberNavController(bottomSheetNavigator),
) {
    ModalBottomSheetLayout(bottomSheetNavigator = bottomSheetNavigator) {
        NavHost(
            navController = navController,
            startDestination = Route.main,
        ) {
            mainComposable()
        }
    }
}

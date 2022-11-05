package me.omico.xero.ui.component

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

fun NavController.navigateToTopLevelDestination(route: String) =
    navigate(route) {
        launchSingleTop = true
        restoreState = true
        popUpTo(startDestinationId) {
            saveState = true
        }
    }

inline val NavController.startDestinationId: Int
    get() = graph.findStartDestination().id

package me.omico.xero.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.get
import com.google.accompanist.navigation.material.BottomSheetNavigator
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi

@OptIn(ExperimentalMaterialNavigationApi::class)
inline val NavGraphBuilder.bottomSheetNavigator: BottomSheetNavigator
    get() = provider[BottomSheetNavigator::class]

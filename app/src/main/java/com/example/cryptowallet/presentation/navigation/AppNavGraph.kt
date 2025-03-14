package com.example.cryptowallet.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.cryptowallet.presentation.navigation.routes.addHomeRoute
import com.example.cryptowallet.presentation.navigation.routes.addSettingsRoute
import com.example.cryptowallet.presentation.navigation.util.enterSlideTransition
import com.example.cryptowallet.presentation.navigation.util.exitSlideTransition
import com.example.cryptowallet.presentation.navigation.util.popEnterSlideTransition
import com.example.cryptowallet.presentation.navigation.util.popExitSlideTransition

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = HomeDestinations.HomeNav,
        enterTransition = { enterSlideTransition() },
        exitTransition = { exitSlideTransition() },
        popEnterTransition = { popEnterSlideTransition() },
        popExitTransition = { popExitSlideTransition() },
        modifier = modifier
    ) {
        addHomeRoute(navController)
        addSettingsRoute(navController)
    }
}


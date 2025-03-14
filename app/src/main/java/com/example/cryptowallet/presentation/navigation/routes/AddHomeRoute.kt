package com.example.cryptowallet.presentation.navigation.routes

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.cryptowallet.presentation.home_screen.HomeScreen
import com.example.cryptowallet.presentation.navigation.HomeDestinations

fun NavGraphBuilder.addHomeRoute(navController: NavController) {
    navigation<HomeDestinations.HomeNav>(
        startDestination = HomeDestinations.HomeScreen
    ) {
        homeDestination(navController)
    }
}

fun NavGraphBuilder.homeDestination(navController: NavController) {
    composable<HomeDestinations.HomeScreen> {
        HomeScreen()
    }
}


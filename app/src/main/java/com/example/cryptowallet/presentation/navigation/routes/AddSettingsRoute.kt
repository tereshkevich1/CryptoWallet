package com.example.cryptowallet.presentation.navigation.routes

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.cryptowallet.presentation.navigation.SettingsDestinations
import com.example.cryptowallet.presentation.settings_screen.SettingsScreen

fun NavGraphBuilder.addSettingsRoute(navController: NavController) {
    navigation<SettingsDestinations.SettingsNav>(
        startDestination = SettingsDestinations.SettingsScreen
    ) {
        settingsDestination(navController)
    }
}

fun NavGraphBuilder.settingsDestination(navController: NavController) {
    composable<SettingsDestinations.SettingsScreen> {
        SettingsScreen()
    }
}
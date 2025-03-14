package com.example.cryptowallet.presentation.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.cryptowallet.R
import com.example.cryptowallet.presentation.navigation.util.Destination

data class TopLevelRoute(
    @StringRes val name: Int,
    val route: Destination,
    @DrawableRes val icon: Int
)
val topLevelRoutes = listOf(
    TopLevelRoute(R.string.home, HomeDestinations.HomeScreen, R.drawable.home_icon),
    TopLevelRoute(R.string.settings, SettingsDestinations.SettingsScreen, R.drawable.settings_icon)
)



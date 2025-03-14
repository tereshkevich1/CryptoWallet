package com.example.cryptowallet.presentation.navigation

import com.example.cryptowallet.presentation.navigation.util.Destination
import kotlinx.serialization.Serializable

sealed class SettingsDestinations: Destination() {
    @Serializable
    data object SettingsNav : SettingsDestinations()

    @Serializable
    data object SettingsScreen : SettingsDestinations()
}
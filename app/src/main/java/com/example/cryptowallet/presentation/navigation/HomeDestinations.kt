package com.example.cryptowallet.presentation.navigation

import com.example.cryptowallet.presentation.navigation.util.Destination
import kotlinx.serialization.Serializable

sealed class HomeDestinations: Destination() {
    @Serializable
    data object HomeNav : HomeDestinations()

    @Serializable
    data object HomeScreen : HomeDestinations()

    @Serializable
    data object CoinDetailScreen : HomeDestinations()

    @Serializable
    data object CryptoSelectionScreen : HomeDestinations()

    @Serializable
    data object TransactionInputScreen : HomeDestinations()
}
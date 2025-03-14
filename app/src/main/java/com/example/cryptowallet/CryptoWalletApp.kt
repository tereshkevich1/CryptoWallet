package com.example.cryptowallet

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.cryptowallet.presentation.navigation.AppNavGraph
import com.example.cryptowallet.presentation.navigation.bottom_nav_bar.BottomNavBar
import com.example.cryptowallet.ui.theme.CryptoWalletTheme
import com.example.cryptowallet.ui.theme.ScaffoldContainerColor

@Composable
fun CryptoWalletApp() {
    val navController = rememberNavController()
    CryptoWalletTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                BottomNavBar(
                    navController = navController,
                    currentDestination = currentDestination,
                )
            },
            containerColor = ScaffoldContainerColor
        ) { innerPadding ->
            AppNavGraph(navController = navController, modifier = Modifier.padding(innerPadding))
        }
    }
}
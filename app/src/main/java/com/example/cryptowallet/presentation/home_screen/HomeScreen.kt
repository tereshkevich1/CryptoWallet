package com.example.cryptowallet.presentation.home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.presentation.home_screen.components.NoTransactionsPanel
import com.example.cryptowallet.presentation.home_screen.components.TotalInfoCrypto
import com.example.cryptowallet.ui.theme.CryptoWalletTheme

@Composable
fun HomeScreen() {
    val isWalletEmpty = true

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(53.dp))
        TotalInfoCrypto(
            isEmpty = isWalletEmpty,
            totalAmount = "0",
            percentageChangeText = "+341,14 $ (+24,1 %)",
            isProfit = true
        )

        if (isWalletEmpty) {
            Spacer(modifier = Modifier.weight(1f))
            NoTransactionsPanel(onAddTransactionClick = {})
            Spacer(modifier = Modifier.weight(3f))
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    CryptoWalletTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            HomeScreen()
        }
    }
}
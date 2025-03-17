package com.example.cryptowallet.presentation.home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.R
import com.example.cryptowallet.presentation.home_screen.components.AddTransactionButton
import com.example.cryptowallet.presentation.home_screen.components.CryptoCard
import com.example.cryptowallet.presentation.home_screen.components.NoTransactionsPanel
import com.example.cryptowallet.presentation.home_screen.components.TotalInfoCrypto
import com.example.cryptowallet.ui.theme.CryptoWalletTheme
import com.example.cryptowallet.ui.theme.DpSpSize.paddingMedium

@Composable
fun HomeScreen() {
    val isWalletEmpty = false

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = paddingMedium),
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
        } else {
            AddTransactionButton({}, modifier = Modifier.padding(vertical = 32.dp))
            CryptoCard(
                iconPainter = painterResource(R.drawable.bitcoin),
                cryptoName = "Bitcoin",
                isProfit = true,
                fiatValue = "24 715,63 $",
                cryptoQuantity = "0,10184712 BTC",
                fiatChangeAmount = "+ 1562 $"
            )
            Spacer(modifier = Modifier.height(8.dp))

            CryptoCard(
                iconPainter = painterResource(R.drawable.cardano),
                cryptoName = "ADA",
                isProfit = false,
                fiatValue = "24 715,63 $",
                cryptoQuantity = "0,10184712 BTC",
                fiatChangeAmount = "- 1562 $"
            )
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
package com.example.cryptowallet.presentation.coint_detail_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.R
import com.example.cryptowallet.presentation.coint_detail_screen.components.CryptoInfoBlock
import com.example.cryptowallet.presentation.coint_detail_screen.components.PriceInfoCard
import com.example.cryptowallet.presentation.coint_detail_screen.components.TransactionCard
import com.example.cryptowallet.presentation.coint_detail_screen.util.CryptoInfo
import com.example.cryptowallet.ui.theme.CryptoWalletTheme
import com.example.cryptowallet.ui.theme.DpSpSize.paddingLarge
import com.example.cryptowallet.ui.theme.DpSpSize.paddingMedium
import com.example.cryptowallet.ui.theme.DpSpSize.paddingSmall
import com.example.cryptowallet.ui.theme.HintTextColor
import com.example.cryptowallet.ui.theme.ScaffoldContainerColor

@Composable
fun CoinDetailScreen(cryptoIcon: Painter) {
    val replenishmentPainter = painterResource(R.drawable.add_icon)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = paddingMedium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        CryptoInfoBlock(
            cryptoIcon = cryptoIcon,
            cryptoInfo = CryptoInfo(
                amount = "24 715,63 $",
                change = "+341,14 $ (+24,1 %)",
                isPositiveChange = true
            )
        )

        Spacer(modifier = Modifier.height(paddingLarge))

        Row(modifier = Modifier.fillMaxWidth()) {
            PriceInfoCard(
                label = stringResource(R.string.average_purchase_price),
                value = "79 129,13 $",
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(paddingSmall))
            PriceInfoCard(
                label = stringResource(R.string.current_price),
                value = "79 129,13 $",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(paddingLarge))

        Text(
            text = stringResource(R.string.transaction),
            style = MaterialTheme.typography.titleSmall,
            color = HintTextColor,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(paddingSmall))

        LazyColumn {
            items(4) {
                TransactionCard(
                    iconPainter = replenishmentPainter,
                    transactionName = stringResource(R.string.replenishment),
                    transactionDate = "11.02.2025",
                    transactionAmount = "+152 $",
                    isDeposit = true
                )
                Spacer(modifier = Modifier.height(paddingSmall))
            }
        }
    }
}

@Composable
@Preview
fun CoinDetailScreenPreview() {
    CryptoWalletTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = ScaffoldContainerColor
        ) {
            CoinDetailScreen(painterResource(R.drawable.bitcoin))
        }
    }
}
package com.example.cryptowallet.presentation.coint_detail_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.cryptowallet.ui.theme.CardContainerColor
import com.example.cryptowallet.ui.theme.DpSpSize
import com.example.cryptowallet.ui.theme.HintTextColor
import com.example.cryptowallet.ui.theme.PrimaryTextColor

@Composable
fun PriceInfoCard(label: String, value: String, modifier: Modifier = Modifier) {
    Card(
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(containerColor = CardContainerColor),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = DpSpSize.paddingLarge, horizontal = DpSpSize.paddingSmall),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                color = HintTextColor
            )

            Spacer(modifier = Modifier.height(DpSpSize.paddingSmall))

            Text(
                text = value,
                style = MaterialTheme.typography.titleLarge,
                color = PrimaryTextColor
            )
        }
    }
}
package com.example.cryptowallet.presentation.coint_detail_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.ui.theme.CardContainerColor
import com.example.cryptowallet.ui.theme.DpSpSize
import com.example.cryptowallet.ui.theme.HintTextColor
import com.example.cryptowallet.ui.theme.NegativeChangeColor
import com.example.cryptowallet.ui.theme.PositiveChangeColor
import com.example.cryptowallet.ui.theme.PrimaryTextColor

@Composable
fun TransactionCard(
    iconPainter: Painter,
    transactionName: String,
    transactionDate: String,
    transactionAmount: String,
    isDeposit: Boolean
) {
    Card(
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(containerColor = CardContainerColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(DpSpSize.сardContentPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = iconPainter,
                contentDescription = null,
                modifier = Modifier
                    .size(DpSpSize.mediumIconSize)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(DpSpSize.сardContentPadding))

            Column {
                Text(
                    text = transactionName,
                    style = MaterialTheme.typography.titleMedium,
                    color = PrimaryTextColor
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = transactionDate,
                    style = MaterialTheme.typography.bodyMedium,
                    color = HintTextColor
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = transactionAmount,
                style = MaterialTheme.typography.titleMedium,
                color = if (isDeposit) PositiveChangeColor else NegativeChangeColor
            )
        }
    }
}
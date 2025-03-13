package com.example.cryptowallet.presentation.home_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.cryptowallet.R
import com.example.cryptowallet.ui.theme.DpSpSize
import com.example.cryptowallet.ui.theme.HintTextColor
import com.example.cryptowallet.ui.theme.NegativeChangeColor
import com.example.cryptowallet.ui.theme.PositiveChangeColor

@Composable
fun TotalInfoCrypto(
    isEmpty: Boolean,
    totalAmount: String,
    percentageChangeText: String? = null,
    isProfit: Boolean? = null
) {
    Text(
        text = stringResource(R.string.total),
        style = MaterialTheme.typography.titleLarge,
        color = HintTextColor
    )
    Spacer(modifier = Modifier.height(DpSpSize.paddingMedium))
    Text(
        text = "$totalAmount ${stringResource(R.string.usd)}",
        style = MaterialTheme.typography.displayMedium
    )

    if (!isEmpty) {
        percentageChangeText?.let { change ->
            val changeColor = when (isProfit) {
                true -> PositiveChangeColor
                false -> NegativeChangeColor
                null -> HintTextColor
            }
            Spacer(modifier = Modifier.height(DpSpSize.paddingSmall))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = change,
                    style = MaterialTheme.typography.bodyMedium,
                    color = changeColor
                )
                Spacer(modifier = Modifier.width(DpSpSize.paddingSmall))
                Text(
                    text = stringResource(R.string.all_time),
                    style = MaterialTheme.typography.bodyMedium,
                    color = HintTextColor
                )
            }
        }
    }
}
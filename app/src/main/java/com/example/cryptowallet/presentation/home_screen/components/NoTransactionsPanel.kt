package com.example.cryptowallet.presentation.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.R
import com.example.cryptowallet.ui.theme.DpSpSize
import com.example.cryptowallet.ui.theme.HintTextColor

@Composable
fun NoTransactionsPanel(onAddTransactionClick: () -> Unit, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.null_transaction),
            contentDescription = stringResource(R.string.null_transaction_image),
            modifier = Modifier.size(128.dp)
        )
        Spacer(modifier = Modifier.height(DpSpSize.paddingMedium))
        Text(
            text = stringResource(R.string.null_transaction),
            style = MaterialTheme.typography.titleLarge,
            color = HintTextColor
        )
        Spacer(modifier = Modifier.height(DpSpSize.paddingMedium))
        AddTransactionButton(onClick = onAddTransactionClick)
    }
}
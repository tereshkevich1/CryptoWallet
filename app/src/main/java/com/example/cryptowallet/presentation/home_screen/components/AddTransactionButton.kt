package com.example.cryptowallet.presentation.home_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.R
import com.example.cryptowallet.ui.theme.AddButtonContainerColor
import com.example.cryptowallet.ui.theme.AddButtonContentColor
import com.example.cryptowallet.ui.theme.DpSpSize

@Composable
fun AddTransactionButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = AddButtonContainerColor,
            contentColor = AddButtonContentColor
        ),
        contentPadding = PaddingValues(DpSpSize.paddingMedium),
        modifier = modifier
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                painter = painterResource(R.drawable.add),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(R.string.add_transaction),
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}
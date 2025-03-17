package com.example.cryptowallet.presentation.coint_detail_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.cryptowallet.presentation.coint_detail_screen.util.CryptoInfo
import com.example.cryptowallet.ui.theme.DpSpSize
import com.example.cryptowallet.ui.theme.NegativeChangeColor
import com.example.cryptowallet.ui.theme.PositiveChangeColor
import com.example.cryptowallet.ui.theme.PrimaryTextColor

@Composable
fun CryptoInfoBlock(
    cryptoIcon: Painter,
    cryptoInfo: CryptoInfo
) {
    Image(
        painter = cryptoIcon,
        contentDescription = null,
        modifier = Modifier
            .size(DpSpSize.largeIconSize)
            .clip(CircleShape)
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = cryptoInfo.amount,
        style = MaterialTheme.typography.headlineSmall,
        color = PrimaryTextColor
    )
    Spacer(modifier = Modifier.height(DpSpSize.paddingSmall))
    Text(
        text = cryptoInfo.change,
        style = MaterialTheme.typography.labelLarge,
        color = if (cryptoInfo.isPositiveChange) PositiveChangeColor else NegativeChangeColor
    )
}
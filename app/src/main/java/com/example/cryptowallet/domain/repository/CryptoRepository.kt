package com.example.cryptowallet.domain.repository

import com.example.cryptowallet.core.domain.util.DataError
import com.example.cryptowallet.core.domain.util.Result

interface CryptoRepository {
    suspend fun getCrypto(): Result<Unit, DataError.Network>
}
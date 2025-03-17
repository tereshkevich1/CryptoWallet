package com.example.cryptowallet.core.networking

import com.example.cryptowallet.core.domain.util.DataError
import com.example.cryptowallet.core.domain.util.Result
import com.google.gson.JsonSyntaxException
import retrofit2.Response
import java.nio.channels.UnresolvedAddressException

suspend inline fun <T> responseToResult(
    execute: suspend () -> Response<T>
): Result<T, DataError.Network> {
    return try {
        val response = execute()
        val body = response.body()
        if (response.isSuccessful && body != null) {
            Result.Success(body)
        } else {
            when (response.code()) {
                408 -> Result.Error(DataError.Network.REQUEST_TIMEOUT)
                429 -> Result.Error(DataError.Network.TOO_MANY_REQUESTS)
                in 500..599 -> Result.Error(DataError.Network.SERVER_ERROR)
                else -> Result.Error(DataError.Network.UNKNOWN)
            }
        }
    } catch (e: UnresolvedAddressException) {
        Result.Error(DataError.Network.NO_INTERNET)
    } catch (e: JsonSyntaxException) {
        Result.Error(DataError.Network.SERIALIZATION)
    } catch (e: Exception) {
        Result.Error(DataError.Network.UNKNOWN)
    }
}
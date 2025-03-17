package com.example.cryptowallet.core.domain.util

typealias DomainError = Error

sealed interface Result<out D, out E : DomainError> {
    data class Success<out D, out E : DomainError>(val data: D) : Result<D, E>
    data class Error<out D, out E : DomainError>(val error: DomainError) : Result<D, E>
}
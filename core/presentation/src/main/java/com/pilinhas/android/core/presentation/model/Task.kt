package com.vestibulario.core.presentation.model

sealed class Task<out T> {
    object Loading : Task<Nothing>()
    class Success<T>(val data: T) : Task<T>()
    class Error<T>(val throwable: Throwable) : Task<T>()
}
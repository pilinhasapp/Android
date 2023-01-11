package com.vestibulario.domain.model

sealed class SignInException : IllegalArgumentException() {
    object InvalidCredentials : SignInException()
    object Unknown : SignInException()
}

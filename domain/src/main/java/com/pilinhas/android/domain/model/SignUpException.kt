package com.vestibulario.domain.model

sealed class SignUpException : IllegalArgumentException() {
    object EmailAlreadyInUse : SignUpException()
    object Unknown : SignUpException()
}

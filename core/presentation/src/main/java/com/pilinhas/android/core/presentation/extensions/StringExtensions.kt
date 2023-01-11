package com.vestibulario.core.presentation.extensions

import android.util.Patterns

private const val PASSWORD_MIN_LENGTH = 8

fun String.isPasswordValid() =
    isNotBlank() && length >= PASSWORD_MIN_LENGTH

fun String.isEmailValid() =
    Patterns.EMAIL_ADDRESS.matcher(this).matches()

fun String.isNameValid() =
    isNotBlank()
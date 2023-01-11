package com.vestibulario.domain.repository

import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {

    fun getAccessToken(): Flow<String?>

    fun saveNewAuthentication(
        accessToken: String,
        refreshToken: String,
        expiresIn: Long
    ): Flow<Unit>
}
package com.vestibulario.domain.repository

import com.vestibulario.domain.model.SignIn
import com.vestibulario.domain.model.SignUp
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun isLoggedIn(): Flow<Boolean>
    fun getUid(): Flow<String?>
    fun signInWithGoogle(idToken: String): Flow<Unit>
    fun signInWithFacebook(accessToken: String): Flow<Unit>
    fun signIn(signIn: SignIn): Flow<Unit>
    fun signUp(signUp: SignUp): Flow<Unit>
}
package com.vestibulario.domain.usecase

import com.vestibulario.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SignInWithFacebookUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(accessToken: String): Flow<Unit> =
        userRepository.signInWithFacebook(accessToken = accessToken)
}
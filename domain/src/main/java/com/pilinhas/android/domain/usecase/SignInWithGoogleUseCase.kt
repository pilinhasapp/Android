package com.vestibulario.domain.usecase

import com.vestibulario.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SignInWithGoogleUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(idToken: String): Flow<Unit> =
        userRepository.signInWithGoogle(idToken = idToken)
}
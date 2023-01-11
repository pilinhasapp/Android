package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.SignIn
import com.vestibulario.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SignInUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(signIn: SignIn): Flow<Unit> =
        userRepository.signIn(signIn = signIn)
}
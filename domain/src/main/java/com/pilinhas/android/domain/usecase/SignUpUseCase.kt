package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.SignUp
import com.vestibulario.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SignUpUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(signUp: SignUp): Flow<Unit> =
        userRepository.signUp(signUp = signUp)
}
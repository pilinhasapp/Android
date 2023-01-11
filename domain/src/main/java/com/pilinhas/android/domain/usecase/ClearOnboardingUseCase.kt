package com.vestibulario.domain.usecase

import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ClearOnboardingUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke() =
        goalRepository.clear()
}
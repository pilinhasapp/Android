package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.GoalsSetupPage
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetOnboardingCanProceedByPageUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(page: GoalsSetupPage): Flow<Boolean> =
        goalRepository.getCanProceedByPage(page = page)
}
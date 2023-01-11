package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.State
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetOnboardingAvailableStateListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(): Flow<List<State>> =
        goalRepository.getAvailableStateList()
}
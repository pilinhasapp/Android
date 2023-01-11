package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Goal
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetOnboardingSelectionListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(selectionList: List<Goal>): Flow<Unit> =
        goalRepository.setGoalList(goalList = selectionList)
}
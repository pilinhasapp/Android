package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Campus
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetOnboardingSelectedCampusListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(campusList: List<Campus>): Flow<Unit> =
        goalRepository.setSelectedCampusList(campusList = campusList)
}
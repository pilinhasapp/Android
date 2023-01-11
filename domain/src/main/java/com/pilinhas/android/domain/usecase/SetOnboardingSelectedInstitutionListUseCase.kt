package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Institution
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetOnboardingSelectedInstitutionListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(institutionList: List<Institution>): Flow<Unit> =
        goalRepository.setSelectedInstitutionList(institutionList = institutionList)
}
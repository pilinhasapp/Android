package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.MostAccessedInstitution
import com.vestibulario.domain.repository.MostAccessedInstitutionRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetMostAccessedInstitutionListUseCase @Inject constructor(
    private val mostAccessedInstitutionRepository: MostAccessedInstitutionRepository
) {
    operator fun invoke(): Flow<List<MostAccessedInstitution>> =
        mostAccessedInstitutionRepository.getList()
}
package com.vestibulario.domain.usecase

import com.vestibulario.domain.repository.MostSearchedTermRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetMostSearchedTermListUseCase @Inject constructor(
    private val mostSearchedTermRepository: MostSearchedTermRepository
) {
    operator fun invoke(): Flow<List<String>> =
        mostSearchedTermRepository.getList()
}
package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Search
import com.vestibulario.domain.repository.SearchRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SearchUseCase @Inject constructor(
    private val searchRepository: SearchRepository
) {
    operator fun invoke(term: String): Flow<List<Search>> =
        searchRepository.search(term = term)
}
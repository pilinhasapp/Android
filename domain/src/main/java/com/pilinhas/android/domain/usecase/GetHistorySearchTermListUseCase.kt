package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.HistorySearchTerm
import com.vestibulario.domain.repository.HistorySearchTermRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetHistorySearchTermListUseCase @Inject constructor(
    private val historySearchTermRepository: HistorySearchTermRepository
) {
    operator fun invoke(): Flow<List<HistorySearchTerm>> =
        historySearchTermRepository.getList()
}
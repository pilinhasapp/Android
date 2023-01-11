package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.HistorySearchTerm
import com.vestibulario.domain.repository.HistorySearchTermRepository
import com.vestibulario.domain.repository.UserRepository
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map

@Singleton
class AddTermToHistoryUseCase @Inject constructor(
    private val historySearchTermRepository: HistorySearchTermRepository,
    private val userRepository: UserRepository
) {
    @OptIn(ExperimentalCoroutinesApi::class)
    operator fun invoke(term: String): Flow<Unit> =
        userRepository.getUid()
            .map {
                HistorySearchTerm(
                    id = UUID.randomUUID().toString(),
                    uid = it,
                    timestamp = System.currentTimeMillis(),
                    term = term
                )
            }
            .flatMapLatest { historySearchTermRepository.addNewTerm(term = it) }
}
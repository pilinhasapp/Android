package com.vestibulario.domain.repository

import com.vestibulario.domain.model.HistorySearchTerm
import kotlinx.coroutines.flow.Flow

interface HistorySearchTermRepository {
    fun getList(): Flow<List<HistorySearchTerm>>
    fun addNewTerm(term: HistorySearchTerm): Flow<Unit>
    fun syncLocalWithRemote(): Flow<Unit>
}
package com.vestibulario.domain.repository

import kotlinx.coroutines.flow.Flow

interface MostSearchedTermRepository {
    fun getList(): Flow<List<String>>
    fun syncLocalWithRemote(): Flow<Unit>
}
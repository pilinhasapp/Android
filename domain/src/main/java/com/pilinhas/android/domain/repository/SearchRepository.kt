package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Search
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    fun search(term: String): Flow<List<Search>>
}
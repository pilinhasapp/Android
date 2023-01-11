package com.vestibulario.domain.repository

import com.vestibulario.domain.model.State
import kotlinx.coroutines.flow.Flow

interface StateRepository {
    fun getById(id: String): Flow<State>
}
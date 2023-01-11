package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Period
import kotlinx.coroutines.flow.Flow

interface PeriodRepository {
    fun getById(id: String): Flow<Period>
}
package com.pilinhas.android.domain.repository

import com.pilinhas.android.domain.model.Income
import kotlinx.coroutines.flow.Flow

interface IncomeRepository {
    fun add(income: Income): Flow<Unit>
}
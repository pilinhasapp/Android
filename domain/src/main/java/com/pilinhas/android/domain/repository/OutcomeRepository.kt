package com.pilinhas.android.domain.repository

import com.pilinhas.android.domain.model.Outcome
import kotlinx.coroutines.flow.Flow

interface OutcomeRepository {
    fun add(outcome: Outcome): Flow<Unit>
}
package com.pilinhas.android.domain.usecase

import com.pilinhas.android.domain.model.Income
import com.pilinhas.android.domain.repository.IncomeRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class AddIncomeUseCase @Inject constructor(
    private val incomeRepository: IncomeRepository
) {
    operator fun invoke(income: Income): Flow<Unit> =
        incomeRepository.add(income = income)
}
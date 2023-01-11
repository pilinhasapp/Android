package com.pilinhas.android.core.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pilinhas.android.core.database.dao.IncomeDao
import com.pilinhas.android.core.database.dao.OutcomeDao
import com.pilinhas.android.core.database.model.IncomeEntity
import com.pilinhas.android.core.database.model.OutcomeEntity

@Database(
    entities = [
        IncomeEntity::class,
        OutcomeEntity::class
    ],
    version = 1
)
abstract class PilinhasDatabase : RoomDatabase() {
    abstract fun incomeDao(): IncomeDao
    abstract fun outcomeDao(): OutcomeDao
}
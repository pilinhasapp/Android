package com.pilinhas.android.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pilinhas.android.core.database.model.IncomeEntity

@Dao
interface IncomeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(incomeEntity: IncomeEntity)

    @Query("DELETE FROM `income`")
    suspend fun clear()

}
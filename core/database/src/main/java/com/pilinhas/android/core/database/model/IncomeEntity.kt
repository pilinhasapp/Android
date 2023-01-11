package com.pilinhas.android.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "income")
data class IncomeEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "amount")
    val amount: Double
)

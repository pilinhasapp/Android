package com.pilinhas.android.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "outcome")
data class OutcomeEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "amount")
    val amount: Double
)

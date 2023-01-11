package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "period")
data class PeriodEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "name")
    val name: String
)

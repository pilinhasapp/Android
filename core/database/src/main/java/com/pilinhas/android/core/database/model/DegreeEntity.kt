package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "degree")
data class DegreeEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "name")
    val name: String
)

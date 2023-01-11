package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "most_accessed_institution")
data class MostAccessedInstitutionEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "initials")
    val initials: String
)

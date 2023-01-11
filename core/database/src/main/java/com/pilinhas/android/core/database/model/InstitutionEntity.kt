package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "institution")
data class InstitutionEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "initials")
    val initials: String,
    @ColumnInfo(name = "state_id")
    val stateId: String
)

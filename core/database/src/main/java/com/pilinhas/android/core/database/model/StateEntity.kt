package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "state")
data class StateEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "region_id")
    val regionId: String,
    @ColumnInfo(name = "initials")
    val initials: String,
    @ColumnInfo(name = "name")
    val name: String
)

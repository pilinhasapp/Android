package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history_search_term")
data class HistorySearchTermEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "uid")
    val uid: String?,
    @ColumnInfo(name = "term")
    val term: String,
    @ColumnInfo(name = "timestamp")
    val timestamp: Long
)

package com.vestibulario.domain.model

data class HistorySearchTerm(
    val id: String,
    val uid: String?,
    val term: String,
    val timestamp: Long
)

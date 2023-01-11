package com.vestibulario.domain.model

sealed class Search {
    abstract val id: String
    abstract val name: String

    data class Course(
        override val id: String,
        override val name: String
    ) : Search()

    data class Campus(
        override val id: String,
        override val name: String
    ) : Search()

    data class Institution(
        override val id: String,
        override val name: String
    ) : Search()

}

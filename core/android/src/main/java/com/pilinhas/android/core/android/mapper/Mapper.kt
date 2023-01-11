package com.pilinhas.android.core.android.mapper

interface Mapper<I, O> {
    fun map(input: I): O
}

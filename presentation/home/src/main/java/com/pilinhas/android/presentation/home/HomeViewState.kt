package com.pilinhas.android.presentation.home

import com.pilinhas.android.presentation.home.model.IntervalPresentation

sealed interface HomeViewState {

    object IsLoading : HomeViewState

    data class HasLoaded(
        val intervals: List<IntervalPresentation>
    ) : HomeViewState

}

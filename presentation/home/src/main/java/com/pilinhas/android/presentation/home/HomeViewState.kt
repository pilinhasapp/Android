package com.pilinhas.android.presentation.home

import com.pilinhas.android.presentation.home.model.IntervalPresentation

sealed interface HomeViewState {

    object IsLoading : HomeViewState

    data class HasLoaded(
        val selectedTabIndex: Int,
        val intervals: List<IntervalPresentation>
    ) : HomeViewState

}

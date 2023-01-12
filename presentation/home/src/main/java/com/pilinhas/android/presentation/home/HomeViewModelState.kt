package com.pilinhas.android.presentation.home

import com.pilinhas.android.presentation.home.model.IntervalPresentation

data class HomeViewModelState(
    val isLoading: Boolean = true,
    val intervals: List<IntervalPresentation> = emptyList()
) {
    fun toViewState(): HomeViewState =
        if (isLoading) {
            HomeViewState.IsLoading
        } else {
            HomeViewState.HasLoaded(intervals = intervals)
        }

}

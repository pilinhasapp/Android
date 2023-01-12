package com.pilinhas.android.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pilinhas.android.core.android.vieweffectsender.ViewEffectSender
import com.pilinhas.android.core.android.vieweffectsender.ViewEffectSenderImpl
import com.pilinhas.android.core.android.viewstateholder.ViewStateHolder
import com.pilinhas.android.presentation.home.model.IntervalPresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(),
    ViewStateHolder<HomeViewState>,
    ViewEffectSender<HomeViewEffect> by ViewEffectSenderImpl() {

    private val viewModelState = MutableStateFlow(value = HomeViewModelState())

    override val viewState: StateFlow<HomeViewState> =
        viewModelState
            .map { it.toViewState() }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.Eagerly,
                initialValue = viewModelState.value.toViewState()
            )

    init {
        viewModelState.update {
            it.copy(
                isLoading = false, intervals = listOf(
                    IntervalPresentation(
                        id = "JAN/23",
                        tabTitle = "JAN/23",
                        incomeAmount = "",
                        outcomeAmount = "",
                        balanceAmount = ""
                    ),
                    IntervalPresentation(
                        id = "DEZ/22",
                        tabTitle = "DEZ/22",
                        incomeAmount = "",
                        outcomeAmount = "",
                        balanceAmount = ""
                    ),
                    IntervalPresentation(
                        id = "NOV/22",
                        tabTitle = "NOV/22",
                        incomeAmount = "",
                        outcomeAmount = "",
                        balanceAmount = ""
                    ),
                    IntervalPresentation(
                        id = "OUT/22",
                        tabTitle = "OUT/22",
                        incomeAmount = "",
                        outcomeAmount = "",
                        balanceAmount = ""
                    ),
                    IntervalPresentation(
                        id = "SET/22",
                        tabTitle = "SET/22",
                        incomeAmount = "",
                        outcomeAmount = "",
                        balanceAmount = ""
                    )
                )
            )
        }
    }

}
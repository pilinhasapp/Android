@file:OptIn(ExperimentalMaterial3Api::class)

package com.pilinhas.android.presentation.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.pilinhas.android.core.presentation.extensions.CollectViewEffect
import com.pilinhas.android.core.presentation.extensions.collectViewState

@Composable
fun HomeScreen(navController: NavController) {
    val viewModel: HomeViewModel = hiltViewModel()

    viewModel.CollectViewEffect(::handleViewEffect)
    HandleViewState(viewModel = viewModel)
}

@Composable
private fun HandleViewState(viewModel: HomeViewModel) {
    val viewState by viewModel.collectViewState()

    when (val state = viewState) {
        is HomeViewState.HasLoaded -> OnHasLoadedViewState(viewState = state)
        HomeViewState.IsLoading -> OnIsLoadingViewState()
    }
}

@Composable
private fun OnHasLoadedViewState(viewState: HomeViewState.HasLoaded) {
    Scaffold {
        ScrollableTabRow(
            modifier = Modifier.padding(it),
            selectedTabIndex = viewState.selectedTabIndex
        ) {
            viewState.intervals.forEach { intervalPresentation ->
                Tab(selected = intervalPresentation.isSelected, onClick = { /*TODO*/ }) {
                    Text(text = intervalPresentation.title)
                }
            }
        }
    }
}

@Composable
private fun OnIsLoadingViewState() {
    Scaffold {
        CircularProgressIndicator(
            modifier = Modifier.padding(it)
        )
    }
}

private fun handleViewEffect(viewEffect: HomeViewEffect) {

}
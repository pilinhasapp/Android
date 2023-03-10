@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class)

package com.pilinhas.android.presentation.home

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.pilinhas.android.core.presentation.constants.SizeConstants
import com.pilinhas.android.core.presentation.extensions.CollectViewEffect
import com.pilinhas.android.core.presentation.extensions.collectViewState
import com.pilinhas.android.presentation.home.model.IntervalPresentation
import kotlinx.coroutines.launch
import com.pilinhas.android.core.resources.R

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
    val pagerState = rememberPagerState()

    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            TabRow(viewState = viewState, pagerState = pagerState)
            Pager(viewState = viewState, pagerState = pagerState)
        }
    }
}

@Composable
private fun TabRow(viewState: HomeViewState.HasLoaded, pagerState: PagerState) {
    val scope = rememberCoroutineScope()

    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        viewState.intervals.forEachIndexed { index, interval ->
            Tab(
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
                text = {
                    Text(text = interval.tabTitle)
                }
            )
        }
    }
}

@Composable
fun Pager(viewState: HomeViewState.HasLoaded, pagerState: PagerState) {
    HorizontalPager(
        count = viewState.intervals.size,
        state = pagerState,
        key = { viewState.intervals[it].id }
    ) { index ->
        Page(intervalPresentation = viewState.intervals[index])
    }
}

@Composable
fun Page(intervalPresentation: IntervalPresentation) {
    ConstraintLayout {
        val (balance, income, outcome) = createRefs()

        AmountView(
            modifier = Modifier.constrainAs(balance) {
                top.linkTo(parent.top, margin = SizeConstants.Small)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            titleResId = R.string.balance,
            content = intervalPresentation.balanceAmount
        )

        AmountView(
            modifier = Modifier.constrainAs(income) {
                top.linkTo(balance.bottom, margin = SizeConstants.Small)
                start.linkTo(parent.start)
                end.linkTo(outcome.start)
            },
            titleResId = R.string.income,
            content = intervalPresentation.incomeAmount
        )

        AmountView(
            modifier = Modifier.constrainAs(outcome) {
                top.linkTo(balance.bottom, margin = SizeConstants.Small)
                start.linkTo(income.end)
                end.linkTo(parent.end)
            },
            titleResId = R.string.outcome,
            content = intervalPresentation.outcomeAmount
        )

    }
}

@Composable
fun AmountView(
    modifier: Modifier,
    @StringRes titleResId: Int,
    content: String
) {
    Column(modifier = modifier) {
        Text(text = stringResource(id = titleResId))
        Text(text = content)
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
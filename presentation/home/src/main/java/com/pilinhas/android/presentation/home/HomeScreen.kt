package com.pilinhas.android.presentation.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.pilinhas.android.core.presentation.extensions.CollectViewEffect

@Composable
fun HomeScreen(navController: NavController) {
    val viewModel: HomeViewModel = hiltViewModel()

    HandleViewEffect(viewModel = viewModel, navController = navController)
    HandleViewState(viewModel = viewModel, navController = navController)
}

@Composable
private fun HandleViewState(viewModel: HomeViewModel, navController: NavController) {

}

@Composable
private fun HandleViewEffect(viewModel: HomeViewModel, navController: NavController) {
    viewModel.CollectViewEffect { viewEffect ->

    }
}
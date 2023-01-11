package com.vestibulario.presentation.home

sealed class HomeViewEffect {
    data class NavigateToPage(val route: String) : HomeViewEffect()
}

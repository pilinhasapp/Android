package com.vestibulario.presentation.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vestibulario.core.navigation.destination.*
import com.vestibulario.core.presentation.extensions.CollectViewEffect
import com.vestibulario.presentation.home.model.NavigationBarItemPresentation
import com.vestibulario.presentation.home.page.community.CommunityPage
import com.vestibulario.presentation.home.page.goals.GoalsPage
import com.vestibulario.presentation.home.page.home.HomePage
import com.vestibulario.presentation.home.page.profile.ProfilePage
import com.vestibulario.presentation.home.page.search.SearchPage

@Composable
fun HomeScreen(navController: NavController) {

    val viewModel: HomeViewModel = hiltViewModel()
    val childNavController = rememberNavController()

    HandleViewEffect(viewModel = viewModel, navController = navController, childNavController = childNavController)
    HandleViewState(viewModel = viewModel, navController = navController, childNavController = childNavController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HandleViewState(viewModel: HomeViewModel, navController: NavController, childNavController: NavHostController) {
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by childNavController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                NavigationBarItemPresentation.values().forEach { navigationBarItem ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                painter = painterResource(id = navigationBarItem.iconResId),
                                contentDescription = stringResource(id = navigationBarItem.iconContentDescriptionResId)
                            )
                        },
                        label = { Text(stringResource(navigationBarItem.titleResId)) },
                        selected = currentDestination?.hierarchy?.any { it.route == navigationBarItem.route } == true,
                        onClick = { viewModel.onNavigationBarItemClicked(item = navigationBarItem) }
                    )
                }
            }
        }
    ) {
        NavHost(
            navController = childNavController,
            startDestination = NavigationBarItemPresentation.values().first().route,
            modifier = Modifier.padding(it)
        ) {
            NavigationBarItemPresentation.values().forEach { navigationBarItem ->
                composable(route = navigationBarItem.route) { ShowPage(item = navigationBarItem, navController = navController) }
            }
        }
    }
}

@Composable
fun ShowPage(item: NavigationBarItemPresentation, navController: NavController) =
    when (item) {
        NavigationBarItemPresentation.HOME -> HomePage()
        NavigationBarItemPresentation.SEARCH -> SearchPage()
        NavigationBarItemPresentation.FEED -> CommunityPage()
        NavigationBarItemPresentation.GOALS -> GoalsPage(navController = navController)
        NavigationBarItemPresentation.PROFILE -> ProfilePage()
    }

@Composable
private fun HandleViewEffect(viewModel: HomeViewModel, navController: NavController, childNavController: NavHostController) {
    viewModel.CollectViewEffect { viewEffect ->
        when (viewEffect) {
            is HomeViewEffect.NavigateToPage -> childNavController.navigate(viewEffect.route) {
                popUpTo(childNavController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }
}
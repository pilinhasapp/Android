package com.pilinhas.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.pilinhas.android.core.navigation.destination.HomeDestination
import com.pilinhas.android.presentation.home.HomeScreen
import com.pilinhas.android.ui.PilinhasTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            PilinhasTheme { MainScreen() }
        }
    }

    @OptIn(ExperimentalMaterialNavigationApi::class)
    @Composable
    private fun MainScreen() {
        val bottomSheetNavigator = rememberBottomSheetNavigator()
        val navController = rememberNavController(bottomSheetNavigator)
        ModalBottomSheetLayout(bottomSheetNavigator) {
            NavHost(
                navController = navController,
                startDestination = HomeDestination.route
            ) {
                composable(route = HomeDestination.route) { HomeScreen(navController = navController) }
            }
        }

    }

}

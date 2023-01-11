package com.vestibulario.core.presentation.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.vestibulario.core.android.viewstateholder.ViewStateHolder

@Composable
fun <T> ViewStateHolder<T>.collectViewState() =
    viewState.collectAsState()
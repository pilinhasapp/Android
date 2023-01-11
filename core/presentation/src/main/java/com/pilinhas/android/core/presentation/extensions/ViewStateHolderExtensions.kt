package com.pilinhas.android.core.presentation.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.pilinhas.android.core.android.viewstateholder.ViewStateHolder

@Composable
fun <T> ViewStateHolder<T>.collectViewState() =
    viewState.collectAsState()
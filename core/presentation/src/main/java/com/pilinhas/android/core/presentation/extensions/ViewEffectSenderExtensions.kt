package com.vestibulario.core.presentation.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.vestibulario.core.android.vieweffectsender.ViewEffectSender
import kotlinx.coroutines.flow.FlowCollector

@Composable
fun <T> ViewEffectSender<T>.CollectViewEffect(flowCollector: FlowCollector<T>) {
    val context = LocalContext.current
    LaunchedEffect(key1 = context) {
        viewEffect.collect(flowCollector)
    }
}
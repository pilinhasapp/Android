package com.pilinhas.android.core.presentation.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.pilinhas.android.core.android.vieweffectsender.ViewEffectSender
import kotlinx.coroutines.flow.FlowCollector

@Composable
fun <T> ViewEffectSender<T>.CollectViewEffect(flowCollector: FlowCollector<T>) {
    val context = LocalContext.current
    LaunchedEffect(key1 = context) {
        viewEffect.collect(flowCollector)
    }
}
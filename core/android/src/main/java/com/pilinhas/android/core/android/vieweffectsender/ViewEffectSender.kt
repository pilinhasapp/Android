package com.pilinhas.android.core.android.vieweffectsender

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow

interface ViewEffectSender<T> {
    val viewEffect: Flow<T>

    fun ViewModel.sendViewEffect(viewEffect: T)
}

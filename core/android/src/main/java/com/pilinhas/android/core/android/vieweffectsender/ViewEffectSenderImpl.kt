package com.vestibulario.core.android.vieweffectsender

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class ViewEffectSenderImpl<T> : ViewEffectSender<T> {
    private val viewEffectChannel = Channel<T>()
    override val viewEffect: Flow<T> = viewEffectChannel.receiveAsFlow()

    override fun ViewModel.sendViewEffect(viewEffect: T) {
        viewModelScope.launch { viewEffectChannel.send(viewEffect) }
    }
}

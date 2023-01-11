package com.vestibulario.core.presentation.extensions

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun clickableInteractionSource(onClick: () -> Unit) =
    remember { MutableInteractionSource() }
        .also {
            if (it.collectIsPressedAsState().value) {
                onClick()
            }
        }
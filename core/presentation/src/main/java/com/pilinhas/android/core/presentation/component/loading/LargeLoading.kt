package com.vestibulario.core.presentation.component.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.vestibulario.core.presentation.constants.AlphaConstants

@Composable
fun LargeLoading() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.onBackground.copy(alpha = AlphaConstants.Background)
    ) {
        Box {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}
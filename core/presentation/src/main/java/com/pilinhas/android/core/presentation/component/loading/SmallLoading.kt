package com.vestibulario.core.presentation.component.loading

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.vestibulario.core.presentation.constants.SizeConstants

@Composable
fun SmallLoading() {
    LinearProgressIndicator(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = SizeConstants.Small)
    )
}
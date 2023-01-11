package com.vestibulario.core.presentation.component.under_construction

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.vestibulario.core.resources.R
import com.vestibulario.core.presentation.component.error.LargeError

@Composable
fun UnderConstruction() {
    LargeError(
        modifier = Modifier.fillMaxSize(),
        titleResId = R.string.under_construction_state_title,
        subtitleResId = R.string.under_construction_state_subtitle,
        iconResId = R.drawable.ic_construction,
        iconContentDescriptionResId = R.string.under_construction_content_description,
        showButton = false
    )
}
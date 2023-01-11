package com.vestibulario.core.presentation.component.error

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.vestibulario.core.resources.R
import com.vestibulario.core.presentation.constants.SizeConstants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallError(onReloadClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedAssistChip(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(all = SizeConstants.Small),
            onClick = onReloadClick,
            label = { Text(text = stringResource(R.string.default_error_state_action_button_text)) },
            leadingIcon = { Icon(painter = painterResource(id = R.drawable.ic_refresh), contentDescription = stringResource(id = R.string.content_description_reload)) }
        )
    }
}
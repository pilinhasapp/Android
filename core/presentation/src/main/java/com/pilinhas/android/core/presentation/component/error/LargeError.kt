package com.vestibulario.core.presentation.component.error

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.vestibulario.core.resources.R
import com.vestibulario.core.presentation.constants.SizeConstants

@Composable
fun LargeError(
    modifier: Modifier = Modifier.fillMaxWidth(),
    @DrawableRes iconResId: Int = R.drawable.ic_cloud_off,
    @StringRes iconContentDescriptionResId: Int = R.string.default_error_state_content_description,
    @StringRes titleResId: Int = R.string.default_error_state_title,
    @StringRes subtitleResId: Int = R.string.default_error_state_subtitle,
    showButton: Boolean = true,
    @StringRes buttonTextResId: Int = R.string.default_error_state_action_button_text,
    @DrawableRes buttonIconResId: Int? = null,
    @StringRes buttonIconContentDescriptionResId: Int? = null,
    onButtonClick: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(SizeConstants.Small, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = iconResId),
            contentDescription = stringResource(id = iconContentDescriptionResId),
            modifier = Modifier.size(size = SizeConstants.ExtraLarge4),
            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onBackground)
        )
        Text(
            text = stringResource(titleResId),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = SizeConstants.Medium)
        )
        Text(
            text = stringResource(subtitleResId),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = SizeConstants.Medium)
        )
        if (showButton) {
            Button(onClick = onButtonClick) {
                if (buttonIconResId != null && buttonIconContentDescriptionResId != null) {
                    Icon(
                        painter = painterResource(id = buttonIconResId),
                        contentDescription = stringResource(id = buttonIconContentDescriptionResId)
                    )
                    Text(
                        modifier = Modifier.padding(start = SizeConstants.ExtraSmall2),
                        text = stringResource(buttonTextResId)
                    )
                } else {
                    Text(text = stringResource(buttonTextResId))
                }
            }
        }
    }
}
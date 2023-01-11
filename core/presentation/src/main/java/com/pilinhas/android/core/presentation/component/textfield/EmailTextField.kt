package com.vestibulario.core.presentation.component.textfield

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.vestibulario.core.presentation.constants.SizeConstants
import com.vestibulario.core.resources.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailTextField(
    value: String,
    isError: Boolean,
    @StringRes errorStringRes: Int,
    onTextChanged: (text: String) -> Unit
) {
    OutlinedTextField(
        value = value,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = SizeConstants.Small)
            .padding(top = SizeConstants.Small),
        label = { Text(text = stringResource(id = R.string.email)) },
        placeholder = { Text(text = stringResource(id = R.string.email_input_placeholder)) },
        onValueChange = onTextChanged,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            autoCorrect = false,
            imeAction = ImeAction.Next
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_at_sign),
                contentDescription = stringResource(id = R.string.content_description_at_sign)
            )
        },
        trailingIcon = {
            if (isError) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_error_filled),
                    contentDescription = stringResource(id = R.string.content_description_error)
                )
            }
        },
        isError = isError,
        supportingText = {
            if (isError) {
                Text(
                    text = stringResource(id = errorStringRes),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    )
}
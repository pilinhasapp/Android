package com.vestibulario.core.presentation.component.textfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.vestibulario.core.presentation.constants.SizeConstants
import com.vestibulario.core.resources.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(
    value: String,
    isError: Boolean,
    onKeyboardActionClicked: () -> Unit,
    onTextChanged: (text: String) -> Unit
) {
    OutlinedTextField(
        value = value,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = SizeConstants.Small)
            .padding(top = SizeConstants.ExtraSmall2),
        label = { Text(text = stringResource(id = R.string.password)) },
        placeholder = { Text(text = stringResource(id = R.string.password_input_placeholder)) },
        onValueChange = onTextChanged,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        visualTransformation = PasswordVisualTransformation(),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_lock_filled),
                contentDescription = stringResource(id = R.string.content_description_lock)
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
        keyboardActions = KeyboardActions { onKeyboardActionClicked() },
        isError = isError,
        supportingText = {
            if (isError) {
                Text(
                    text = stringResource(id = R.string.invalid_password_error_message),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    )
}
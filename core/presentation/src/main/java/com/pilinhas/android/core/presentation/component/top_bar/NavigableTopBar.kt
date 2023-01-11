package com.vestibulario.core.presentation.component.top_bar

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import com.vestibulario.core.kotlin.constants.LineConstants
import com.vestibulario.core.kotlin.constants.StringConstants
import com.vestibulario.core.resources.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigableTitleTopBar(
    title: String = StringConstants.EMPTY,
    onNavigationClick: () -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                maxLines = LineConstants.SINGLE,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_left),
                    contentDescription = stringResource(id = R.string.content_description_arrow_back)
                )
            }
        },
        scrollBehavior = scrollBehavior
    )
}
package com.vestibulario.core.presentation.component.chip_list

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.vestibulario.core.presentation.component.error.SmallError
import com.vestibulario.core.presentation.constants.AlphaConstants
import com.vestibulario.core.presentation.constants.SizeConstants
import com.vestibulario.core.presentation.component.chip_list.model.ChipListPresentation
import com.vestibulario.core.presentation.component.chip_list.model.ChipListItemPresentation
import com.vestibulario.core.presentation.component.loading.SmallLoading
import com.google.accompanist.flowlayout.FlowRow

@Composable
fun ChipList(
    paddingTop: Dp = SizeConstants.Undefined,
    @StringRes titleResId: Int,
    @StringRes noDataTextResId: Int,
    data: ChipListPresentation,
    onReloadClick: () -> Unit = {},
    onItemClick: (id: String) -> Unit
) {
    Text(
        text = stringResource(titleResId),
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = SizeConstants.Small)
            .padding(top = paddingTop)
    )

    when (data) {
        is ChipListPresentation.HasData -> HasData(list = data.list, onItemClick = onItemClick)
        ChipListPresentation.HasNoData -> NoData(noDataTextResId = noDataTextResId)
        ChipListPresentation.IsError -> SmallError(onReloadClick = onReloadClick)
        ChipListPresentation.IsLoading -> SmallLoading()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HasData(
    list: List<ChipListItemPresentation>,
    onItemClick: (id: String) -> Unit
) {
    FlowRow(
        modifier = Modifier
            .padding(horizontal = SizeConstants.Small)
            .padding(bottom = SizeConstants.Small),
        mainAxisSpacing = SizeConstants.ExtraSmall
    ) {
        repeat(list.size) { index ->
            SuggestionChip(
                onClick = { onItemClick(list[index].id) },
                label = { Text(text = list[index].text) }
            )
        }
    }
}

@Composable
private fun NoData(@StringRes noDataTextResId: Int) {
    Text(
        text = stringResource(id = noDataTextResId),
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = SizeConstants.Medium),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.bodyMedium,
        color = LocalContentColor.current.copy(alpha = AlphaConstants.Disabled)
    )
}
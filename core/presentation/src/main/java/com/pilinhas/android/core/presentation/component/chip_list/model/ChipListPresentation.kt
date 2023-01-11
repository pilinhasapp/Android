package com.vestibulario.core.presentation.component.chip_list.model

sealed class ChipListPresentation {
    object IsLoading : ChipListPresentation()
    object IsError : ChipListPresentation()
    object HasNoData : ChipListPresentation()
    data class HasData(val list: List<ChipListItemPresentation>) : ChipListPresentation()
}

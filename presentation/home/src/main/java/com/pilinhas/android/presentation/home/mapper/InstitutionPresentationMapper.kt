package com.vestibulario.presentation.home.mapper

import com.vestibulario.core.android.mapper.Mapper
import com.vestibulario.core.presentation.component.chip_list.model.ChipListItemPresentation
import com.vestibulario.domain.model.MostAccessedInstitution
import javax.inject.Inject

class InstitutionPresentationMapper @Inject constructor() :
    Mapper<MostAccessedInstitution, ChipListItemPresentation> {
    override fun map(input: MostAccessedInstitution): ChipListItemPresentation =
        ChipListItemPresentation(
            id = input.id,
            text = input.initials
        )
}
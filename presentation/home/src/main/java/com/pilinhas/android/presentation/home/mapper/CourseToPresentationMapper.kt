package com.vestibulario.presentation.home.mapper

import com.vestibulario.core.android.mapper.Mapper
import com.vestibulario.core.presentation.component.chip_list.model.ChipListItemPresentation
import com.vestibulario.domain.model.MostAccessedCourse
import javax.inject.Inject

class CourseToPresentationMapper @Inject constructor() :
    Mapper<MostAccessedCourse, ChipListItemPresentation> {
    override fun map(input: MostAccessedCourse): ChipListItemPresentation =
        ChipListItemPresentation(
            id = input.id,
            text = input.name
        )
}
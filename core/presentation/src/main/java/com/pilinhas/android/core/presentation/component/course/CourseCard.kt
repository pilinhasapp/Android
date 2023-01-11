package com.vestibulario.core.presentation.component.course

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.vestibulario.core.presentation.component.course.model.CourseCardPresentation
import com.vestibulario.core.presentation.constants.SizeConstants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseCard(
    presentation: CourseCardPresentation,
    onCardClicked: (course: CourseCardPresentation) -> Unit
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = SizeConstants.Small)
            .padding(top = SizeConstants.ExtraSmall2),
        onClick = { onCardClicked(presentation) }
    ) {
        Text(
            modifier = Modifier
                .padding(horizontal = SizeConstants.ExtraSmall2)
                .padding(top = SizeConstants.Small),
            text = presentation.course.name,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier
                .padding(horizontal = SizeConstants.ExtraSmall2)
                .padding(bottom = SizeConstants.ExtraSmall2)
                .padding(top = SizeConstants.ExtraSmall4),
            text = presentation.course.degree,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Light
        )
    }
}
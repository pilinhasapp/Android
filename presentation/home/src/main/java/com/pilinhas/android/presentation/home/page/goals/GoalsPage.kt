package com.vestibulario.presentation.home.page.goals

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.vestibulario.core.navigation.destination.GoalsSetupDestination
import com.vestibulario.core.presentation.component.error.LargeError
import com.vestibulario.core.presentation.component.loading.LargeLoading
import com.vestibulario.core.presentation.constants.SizeConstants
import com.vestibulario.core.presentation.constants.StringConstants
import com.vestibulario.core.presentation.extensions.CollectViewEffect
import com.vestibulario.core.resources.R

@Composable
fun GoalsPage(navController: NavController) {
    val viewModel: GoalsViewModel = hiltViewModel()

    HandleViewEffect(viewModel = viewModel, navController = navController)
    HandleViewState(viewModel = viewModel)
}

@Composable
private fun HandleViewState(viewModel: GoalsViewModel) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (titleRef, emptyStateRef) = createRefs()

        Text(
            modifier = Modifier.constrainAs(titleRef) {
                top.linkTo(parent.top, margin = SizeConstants.Medium)
                start.linkTo(parent.start, margin = SizeConstants.Small)
                end.linkTo(parent.end, margin = SizeConstants.Small)
                width = Dimension.fillToConstraints
            },
            text = stringResource(id = R.string.my_goals),
            style = MaterialTheme.typography.headlineMedium
        )

        LargeError(
            modifier = Modifier.constrainAs(emptyStateRef) {
                top.linkTo(titleRef.bottom, margin = SizeConstants.Small)
                bottom.linkTo(parent.bottom, margin = SizeConstants.Small)
                start.linkTo(parent.start, margin = SizeConstants.Small)
                end.linkTo(parent.end, margin = SizeConstants.Small)
            },
            iconResId = R.drawable.ic_goals,
            iconContentDescriptionResId = R.string.content_description_goals,
            titleResId = R.string.goals_home_title,
            subtitleResId = R.string.goals_home_subtitle,
            showButton = true,
            buttonTextResId = R.string.add_my_goals,
            buttonIconResId = R.drawable.ic_add_task,
            buttonIconContentDescriptionResId = R.string.content_description_add_task,
            onButtonClick = viewModel::onSetupGoalsClicked
        )
    }
}

@Composable
private fun HandleViewEffect(viewModel: GoalsViewModel, navController: NavController) {
    viewModel.CollectViewEffect { viewEffect ->
        when (viewEffect) {
            GoalsViewEffect.NavigateToGoalsSetup -> navController.navigate(GoalsSetupDestination.route)
        }
    }
}
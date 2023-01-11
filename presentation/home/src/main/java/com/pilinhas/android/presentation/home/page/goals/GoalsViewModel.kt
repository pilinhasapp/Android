package com.vestibulario.presentation.home.page.goals

import androidx.lifecycle.ViewModel
import com.vestibulario.core.android.vieweffectsender.ViewEffectSender
import com.vestibulario.core.android.vieweffectsender.ViewEffectSenderImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GoalsViewModel @Inject constructor() : ViewModel(),
    ViewEffectSender<GoalsViewEffect> by ViewEffectSenderImpl() {

    fun onSetupGoalsClicked() {
        sendViewEffect(viewEffect = GoalsViewEffect.NavigateToGoalsSetup)
    }

}
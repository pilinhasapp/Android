package com.vestibulario.presentation.home

import androidx.lifecycle.ViewModel
import com.vestibulario.core.android.vieweffectsender.ViewEffectSender
import com.vestibulario.core.android.vieweffectsender.ViewEffectSenderImpl
import com.vestibulario.presentation.home.model.NavigationBarItemPresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(),
    ViewEffectSender<HomeViewEffect> by ViewEffectSenderImpl() {

    fun onNavigationBarItemClicked(item: NavigationBarItemPresentation) {
        sendViewEffect(viewEffect = HomeViewEffect.NavigateToPage(route = item.route))
    }

}
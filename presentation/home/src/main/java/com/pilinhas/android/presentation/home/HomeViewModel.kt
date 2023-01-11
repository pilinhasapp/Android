package com.pilinhas.android.presentation.home

import androidx.lifecycle.ViewModel
import com.pilinhas.android.core.android.vieweffectsender.ViewEffectSender
import com.pilinhas.android.core.android.vieweffectsender.ViewEffectSenderImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(),
    ViewEffectSender<HomeViewEffect> by ViewEffectSenderImpl() {



}
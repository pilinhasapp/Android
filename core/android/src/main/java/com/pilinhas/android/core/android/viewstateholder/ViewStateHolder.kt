package com.pilinhas.android.core.android.viewstateholder

import kotlinx.coroutines.flow.StateFlow

interface ViewStateHolder<T> {
    val viewState: StateFlow<T>
}

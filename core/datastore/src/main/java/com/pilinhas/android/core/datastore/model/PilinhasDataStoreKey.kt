package com.pilinhas.android.core.datastore.model

import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

sealed class PilinhasDataStoreKey<T>(internal val key: Preferences.Key<T>) {

}

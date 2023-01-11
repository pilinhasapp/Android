package com.vestibulario.core.datastore.model

import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

sealed class VestibularioDataStoreKey<T>(internal val key: Preferences.Key<T>) {
    object AccessToken : VestibularioDataStoreKey<String>(key = stringPreferencesKey("access_token"))
    object RefreshToken : VestibularioDataStoreKey<String>(key = stringPreferencesKey("refresh_token"))
    object AccessTokenExpirationTimestamp : VestibularioDataStoreKey<Long>(key = longPreferencesKey("access_token_expiration_timestamp"))
}

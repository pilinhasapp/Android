package com.pilinhas.android.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    surfaceTint = Color.Light.surfaceTint,
    onErrorContainer = Color.Light.onErrorContainer,
    onError = Color.Light.onError,
    errorContainer = Color.Light.errorContainer,
    onTertiaryContainer = Color.Light.onTertiaryContainer,
    onTertiary = Color.Light.onTertiary,
    tertiaryContainer = Color.Light.tertiaryContainer,
    tertiary = Color.Light.tertiary,
    error = Color.Light.error,
    outline = Color.Light.outline,
    onBackground = Color.Light.onBackground,
    background = Color.Light.background,
    inverseOnSurface = Color.Light.inverseOnSurface,
    inverseSurface = Color.Light.inverseSurface,
    onSurfaceVariant = Color.Light.onSurfaceVariant,
    onSurface = Color.Light.onSurface,
    surfaceVariant = Color.Light.surfaceVariant,
    surface = Color.Light.surface,
    onSecondaryContainer = Color.Light.onSecondaryContainer,
    onSecondary = Color.Light.onSecondary,
    secondaryContainer = Color.Light.secondaryContainer,
    secondary = Color.Light.secondary,
    inversePrimary = Color.Light.inversePrimary,
    onPrimaryContainer = Color.Light.onPrimaryContainer,
    onPrimary = Color.Light.onPrimary,
    primaryContainer = Color.Light.primaryContainer,
    primary = Color.Light.primary,
)

private val DarkColors = darkColorScheme(
    surfaceTint = Color.Dark.surfaceTint,
    onErrorContainer = Color.Dark.onErrorContainer,
    onError = Color.Dark.onError,
    errorContainer = Color.Dark.errorContainer,
    onTertiaryContainer = Color.Dark.onTertiaryContainer,
    onTertiary = Color.Dark.onTertiary,
    tertiaryContainer = Color.Dark.tertiaryContainer,
    tertiary = Color.Dark.tertiary,
    error = Color.Dark.error,
    outline = Color.Dark.outline,
    onBackground = Color.Dark.onBackground,
    background = Color.Dark.background,
    inverseOnSurface = Color.Dark.inverseOnSurface,
    inverseSurface = Color.Dark.inverseSurface,
    onSurfaceVariant = Color.Dark.onSurfaceVariant,
    onSurface = Color.Dark.onSurface,
    surfaceVariant = Color.Dark.surfaceVariant,
    surface = Color.Dark.surface,
    onSecondaryContainer = Color.Dark.onSecondaryContainer,
    onSecondary = Color.Dark.onSecondary,
    secondaryContainer = Color.Dark.secondaryContainer,
    secondary = Color.Dark.secondary,
    inversePrimary = Color.Dark.inversePrimary,
    onPrimaryContainer = Color.Dark.onPrimaryContainer,
    onPrimary = Color.Dark.onPrimary,
    primaryContainer = Color.Dark.primaryContainer,
    primary = Color.Dark.primary,
)

@Composable
fun PilinhasTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = when (isSystemInDarkTheme()) {
            true -> DarkColors
            false -> LightColors
        },
        content = content
    )
}
package ru.notforgotcompose.presentation.common.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = base2,
    primaryVariant = statusBarColor,
    onPrimary = base1,
    secondary = accent,
    onSecondary = base3,
    onSurface = base1,
    onBackground = base1
)

@Composable
fun NotForgotComposeTheme(content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
package com.dessalines.thumbkey.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

fun pink(): Pair<ColorScheme, ColorScheme> {
    val md_theme_light_primary = Color(0xFFA63166)
    val md_theme_light_onPrimary = Color(0xFFFFFFFF)
    val md_theme_light_primaryContainer = Color(0xFFFFD9E3)
    val md_theme_light_onPrimaryContainer = Color(0xFF3E001F)
    val md_theme_light_secondary = Color(0xFF745660)
    val md_theme_light_onSecondary = Color(0xFFFFFFFF)
    val md_theme_light_secondaryContainer = Color(0xFFFFD9E3)
    val md_theme_light_onSecondaryContainer = Color(0xFF2A151D)
    val md_theme_light_tertiary = Color(0xFF7D5636)
    val md_theme_light_onTertiary = Color(0xFFFFFFFF)
    val md_theme_light_tertiaryContainer = Color(0xFFFFDCC3)
    val md_theme_light_onTertiaryContainer = Color(0xFF2F1500)
    val md_theme_light_error = Color(0xFFBA1A1A)
    val md_theme_light_errorContainer = Color(0xFFFFDAD6)
    val md_theme_light_onError = Color(0xFFFFFFFF)
    val md_theme_light_onErrorContainer = Color(0xFF410002)
    val md_theme_light_background = Color(0xFFFFFBFF)
    val md_theme_light_onBackground = Color(0xFF201A1C)
    val md_theme_light_surface = Color(0xFFFFFBFF)
    val md_theme_light_onSurface = Color(0xFF201A1C)
    val md_theme_light_surfaceVariant = Color(0xFFF2DDE2)
    val md_theme_light_onSurfaceVariant = Color(0xFF514347)
    val md_theme_light_outline = Color(0xFF837377)
    val md_theme_light_inverseOnSurface = Color(0xFFFAEEF0)
    val md_theme_light_inverseSurface = Color(0xFF352F30)
    val md_theme_light_inversePrimary = Color(0xFFFFB0CB)
//    val md_theme_light_shadow = Color(0xFF000000)
    val md_theme_light_surfaceTint = Color(0xFFA63166)
    val md_theme_light_outlineVariant = Color(0xFFD5C2C6)
    val md_theme_light_scrim = Color(0xFF000000)

    val md_theme_dark_primary = Color(0xFFFFB0CB)
    val md_theme_dark_onPrimary = Color(0xFF640036)
    val md_theme_dark_primaryContainer = Color(0xFF87164E)
    val md_theme_dark_onPrimaryContainer = Color(0xFFFFD9E3)
    val md_theme_dark_secondary = Color(0xFFE2BDC7)
    val md_theme_dark_onSecondary = Color(0xFF422932)
    val md_theme_dark_secondaryContainer = Color(0xFF5A3F48)
    val md_theme_dark_onSecondaryContainer = Color(0xFFFFD9E3)
    val md_theme_dark_tertiary = Color(0xFFF0BC95)
    val md_theme_dark_onTertiary = Color(0xFF48290D)
    val md_theme_dark_tertiaryContainer = Color(0xFF623F21)
    val md_theme_dark_onTertiaryContainer = Color(0xFFFFDCC3)
    val md_theme_dark_error = Color(0xFFFFB4AB)
    val md_theme_dark_errorContainer = Color(0xFF93000A)
    val md_theme_dark_onError = Color(0xFF690005)
    val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
    val md_theme_dark_background = Color(0xFF201A1C)
    val md_theme_dark_onBackground = Color(0xFFEBE0E1)
    val md_theme_dark_surface = Color(0xFF201A1C)
    val md_theme_dark_onSurface = Color(0xFFEBE0E1)
    val md_theme_dark_surfaceVariant = Color(0xFF514347)
    val md_theme_dark_onSurfaceVariant = Color(0xFFD5C2C6)
    val md_theme_dark_outline = Color(0xFF9E8C91)
    val md_theme_dark_inverseOnSurface = Color(0xFF201A1C)
    val md_theme_dark_inverseSurface = Color(0xFFEBE0E1)
    val md_theme_dark_inversePrimary = Color(0xFFA63166)
//    val md_theme_dark_shadow = Color(0xFF000000)
    val md_theme_dark_surfaceTint = Color(0xFFFFB0CB)
    val md_theme_dark_outlineVariant = Color(0xFF514347)
    val md_theme_dark_scrim = Color(0xFF000000)

//    val seed = Color(0xFFFF78AE)

    val light = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val dark = darkColorScheme(
        primary = md_theme_dark_primary,
        onPrimary = md_theme_dark_onPrimary,
        primaryContainer = md_theme_dark_primaryContainer,
        onPrimaryContainer = md_theme_dark_onPrimaryContainer,
        secondary = md_theme_dark_secondary,
        onSecondary = md_theme_dark_onSecondary,
        secondaryContainer = md_theme_dark_secondaryContainer,
        onSecondaryContainer = md_theme_dark_onSecondaryContainer,
        tertiary = md_theme_dark_tertiary,
        onTertiary = md_theme_dark_onTertiary,
        tertiaryContainer = md_theme_dark_tertiaryContainer,
        onTertiaryContainer = md_theme_dark_onTertiaryContainer,
        error = md_theme_dark_error,
        errorContainer = md_theme_dark_errorContainer,
        onError = md_theme_dark_onError,
        onErrorContainer = md_theme_dark_onErrorContainer,
        background = md_theme_dark_background,
        onBackground = md_theme_dark_onBackground,
        surface = md_theme_dark_surface,
        onSurface = md_theme_dark_onSurface,
        surfaceVariant = md_theme_dark_surfaceVariant,
        onSurfaceVariant = md_theme_dark_onSurfaceVariant,
        outline = md_theme_dark_outline,
        inverseOnSurface = md_theme_dark_inverseOnSurface,
        inverseSurface = md_theme_dark_inverseSurface,
        inversePrimary = md_theme_dark_inversePrimary,
        surfaceTint = md_theme_dark_surfaceTint,
        outlineVariant = md_theme_dark_outlineVariant,
        scrim = md_theme_dark_scrim,
    )
    return Pair(light, dark)
}

fun green(): Pair<ColorScheme, ColorScheme> {
    val md_theme_light_primary = Color(0xFF216C29)
    val md_theme_light_onPrimary = Color(0xFFFFFFFF)
    val md_theme_light_primaryContainer = Color(0xFFA7F5A1)
    val md_theme_light_onPrimaryContainer = Color(0xFF002204)
    val md_theme_light_secondary = Color(0xFF52634F)
    val md_theme_light_onSecondary = Color(0xFFFFFFFF)
    val md_theme_light_secondaryContainer = Color(0xFFD5E8CF)
    val md_theme_light_onSecondaryContainer = Color(0xFF101F10)
    val md_theme_light_tertiary = Color(0xFF38656A)
    val md_theme_light_onTertiary = Color(0xFFFFFFFF)
    val md_theme_light_tertiaryContainer = Color(0xFFBCEBF1)
    val md_theme_light_onTertiaryContainer = Color(0xFF002023)
    val md_theme_light_error = Color(0xFFBA1A1A)
    val md_theme_light_errorContainer = Color(0xFFFFDAD6)
    val md_theme_light_onError = Color(0xFFFFFFFF)
    val md_theme_light_onErrorContainer = Color(0xFF410002)
    val md_theme_light_background = Color(0xFFFCFDF6)
    val md_theme_light_onBackground = Color(0xFF1A1C19)
    val md_theme_light_surface = Color(0xFFFCFDF6)
    val md_theme_light_onSurface = Color(0xFF1A1C19)
    val md_theme_light_surfaceVariant = Color(0xFFDEE5D8)
    val md_theme_light_onSurfaceVariant = Color(0xFF424940)
    val md_theme_light_outline = Color(0xFF72796F)
    val md_theme_light_inverseOnSurface = Color(0xFFF0F1EB)
    val md_theme_light_inverseSurface = Color(0xFF2F312D)
    val md_theme_light_inversePrimary = Color(0xFF8BD987)
//    val md_theme_light_shadow = Color(0xFF000000)
    val md_theme_light_surfaceTint = Color(0xFF216C29)
    val md_theme_light_outlineVariant = Color(0xFFC2C9BD)
    val md_theme_light_scrim = Color(0xFF000000)

    val md_theme_dark_primary = Color(0xFF8BD987)
    val md_theme_dark_onPrimary = Color(0xFF00390B)
    val md_theme_dark_primaryContainer = Color(0xFF005314)
    val md_theme_dark_onPrimaryContainer = Color(0xFFA7F5A1)
    val md_theme_dark_secondary = Color(0xFFB9CCB3)
    val md_theme_dark_onSecondary = Color(0xFF253423)
    val md_theme_dark_secondaryContainer = Color(0xFF3B4B38)
    val md_theme_dark_onSecondaryContainer = Color(0xFFD5E8CF)
    val md_theme_dark_tertiary = Color(0xFFA0CFD4)
    val md_theme_dark_onTertiary = Color(0xFF00363B)
    val md_theme_dark_tertiaryContainer = Color(0xFF1F4D52)
    val md_theme_dark_onTertiaryContainer = Color(0xFFBCEBF1)
    val md_theme_dark_error = Color(0xFFFFB4AB)
    val md_theme_dark_errorContainer = Color(0xFF93000A)
    val md_theme_dark_onError = Color(0xFF690005)
    val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
    val md_theme_dark_background = Color(0xFF1A1C19)
    val md_theme_dark_onBackground = Color(0xFFE2E3DD)
    val md_theme_dark_surface = Color(0xFF1A1C19)
    val md_theme_dark_onSurface = Color(0xFFE2E3DD)
    val md_theme_dark_surfaceVariant = Color(0xFF424940)
    val md_theme_dark_onSurfaceVariant = Color(0xFFC2C9BD)
    val md_theme_dark_outline = Color(0xFF8C9388)
    val md_theme_dark_inverseOnSurface = Color(0xFF1A1C19)
    val md_theme_dark_inverseSurface = Color(0xFFE2E3DD)
    val md_theme_dark_inversePrimary = Color(0xFF216C29)
//    val md_theme_dark_shadow = Color(0xFF000000)
    val md_theme_dark_surfaceTint = Color(0xFF8BD987)
    val md_theme_dark_outlineVariant = Color(0xFF424940)
    val md_theme_dark_scrim = Color(0xFF000000)

//    val seed = Color(0xFF78C475)

    val light = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val dark = darkColorScheme(
        primary = md_theme_dark_primary,
        onPrimary = md_theme_dark_onPrimary,
        primaryContainer = md_theme_dark_primaryContainer,
        onPrimaryContainer = md_theme_dark_onPrimaryContainer,
        secondary = md_theme_dark_secondary,
        onSecondary = md_theme_dark_onSecondary,
        secondaryContainer = md_theme_dark_secondaryContainer,
        onSecondaryContainer = md_theme_dark_onSecondaryContainer,
        tertiary = md_theme_dark_tertiary,
        onTertiary = md_theme_dark_onTertiary,
        tertiaryContainer = md_theme_dark_tertiaryContainer,
        onTertiaryContainer = md_theme_dark_onTertiaryContainer,
        error = md_theme_dark_error,
        errorContainer = md_theme_dark_errorContainer,
        onError = md_theme_dark_onError,
        onErrorContainer = md_theme_dark_onErrorContainer,
        background = md_theme_dark_background,
        onBackground = md_theme_dark_onBackground,
        surface = md_theme_dark_surface,
        onSurface = md_theme_dark_onSurface,
        surfaceVariant = md_theme_dark_surfaceVariant,
        onSurfaceVariant = md_theme_dark_onSurfaceVariant,
        outline = md_theme_dark_outline,
        inverseOnSurface = md_theme_dark_inverseOnSurface,
        inverseSurface = md_theme_dark_inverseSurface,
        inversePrimary = md_theme_dark_inversePrimary,
        surfaceTint = md_theme_dark_surfaceTint,
        outlineVariant = md_theme_dark_outlineVariant,
        scrim = md_theme_dark_scrim,
    )
    return Pair(light, dark)
}

fun srcery(): Pair<ColorScheme, ColorScheme> {
    val md_theme_light_primary = Color(0xFF6D5E00)
    val md_theme_light_onPrimary = Color(0xFFFFFFFF)
    val md_theme_light_primaryContainer = Color(0xFFFCE365)
    val md_theme_light_onPrimaryContainer = Color(0xFF211B00)
    val md_theme_light_secondary = Color(0xFF655E40)
    val md_theme_light_onSecondary = Color(0xFFFFFFFF)
    val md_theme_light_secondaryContainer = Color(0xFFEDE2BC)
    val md_theme_light_onSecondaryContainer = Color(0xFF201C04)
    val md_theme_light_tertiary = Color(0xFF42664F)
    val md_theme_light_onTertiary = Color(0xFFFFFFFF)
    val md_theme_light_tertiaryContainer = Color(0xFFC4ECCF)
    val md_theme_light_onTertiaryContainer = Color(0xFF002110)
    val md_theme_light_error = Color(0xFFBA1A1A)
    val md_theme_light_errorContainer = Color(0xFFFFDAD6)
    val md_theme_light_onError = Color(0xFFFFFFFF)
    val md_theme_light_onErrorContainer = Color(0xFF410002)
    val md_theme_light_background = Color(0xFFFFFBFF)
    val md_theme_light_onBackground = Color(0xFF1D1B16)
    val md_theme_light_surface = Color(0xFFFFFBFF)
    val md_theme_light_onSurface = Color(0xFF1D1B16)
    val md_theme_light_surfaceVariant = Color(0xFFE9E2D0)
    val md_theme_light_onSurfaceVariant = Color(0xFF4A4739)
    val md_theme_light_outline = Color(0xFF7C7768)
    val md_theme_light_inverseOnSurface = Color(0xFFF6F0E7)
    val md_theme_light_inverseSurface = Color(0xFF32302A)
    val md_theme_light_inversePrimary = Color(0xFFDEC64C)
    val md_theme_light_shadow = Color(0xFF000000)
    val md_theme_light_surfaceTint = Color(0xFF6D5E00)
    val md_theme_light_outlineVariant = Color(0xFFCDC6B4)
    val md_theme_light_scrim = Color(0xFF000000)

    val md_theme_dark_primary = Color(0xFFDEC64C)
    val md_theme_dark_onPrimary = Color(0xFF393000)
    val md_theme_dark_primaryContainer = Color(0xFF524600)
    val md_theme_dark_onPrimaryContainer = Color(0xFFFCE365)
    val md_theme_dark_secondary = Color(0xFFD0C7A2)
    val md_theme_dark_onSecondary = Color(0xFF363016)
    val md_theme_dark_secondaryContainer = Color(0xFF4D472B)
    val md_theme_dark_onSecondaryContainer = Color(0xFFEDE2BC)
    val md_theme_dark_tertiary = Color(0xFFA9D0B4)
    val md_theme_dark_onTertiary = Color(0xFF133724)
    val md_theme_dark_tertiaryContainer = Color(0xFF2B4E39)
    val md_theme_dark_onTertiaryContainer = Color(0xFFC4ECCF)
    val md_theme_dark_error = Color(0xFFFFB4AB)
    val md_theme_dark_errorContainer = Color(0xFF93000A)
    val md_theme_dark_onError = Color(0xFF690005)
    val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
    val md_theme_dark_background = Color(0xFF1D1B16)
    val md_theme_dark_onBackground = Color(0xFFE7E2D9)
    val md_theme_dark_surface = Color(0xFF1D1B16)
    val md_theme_dark_onSurface = Color(0xFFE7E2D9)
    val md_theme_dark_surfaceVariant = Color(0xFF4A4739)
    val md_theme_dark_onSurfaceVariant = Color(0xFFCDC6B4)
    val md_theme_dark_outline = Color(0xFF969080)
    val md_theme_dark_inverseOnSurface = Color(0xFF1D1B16)
    val md_theme_dark_inverseSurface = Color(0xFFE7E2D9)
    val md_theme_dark_inversePrimary = Color(0xFF6D5E00)
    val md_theme_dark_shadow = Color(0xFF000000)
    val md_theme_dark_surfaceTint = Color(0xFFDEC64C)
    val md_theme_dark_outlineVariant = Color(0xFF4A4739)
    val md_theme_dark_scrim = Color(0xFF000000)

    val seed = Color(0xFF1C1B19)

    val light = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val dark = darkColorScheme(
        primary = md_theme_dark_primary,
        onPrimary = md_theme_dark_onPrimary,
        primaryContainer = md_theme_dark_primaryContainer,
        onPrimaryContainer = md_theme_dark_onPrimaryContainer,
        secondary = md_theme_dark_secondary,
        onSecondary = md_theme_dark_onSecondary,
        secondaryContainer = md_theme_dark_secondaryContainer,
        onSecondaryContainer = md_theme_dark_onSecondaryContainer,
        tertiary = md_theme_dark_tertiary,
        onTertiary = md_theme_dark_onTertiary,
        tertiaryContainer = md_theme_dark_tertiaryContainer,
        onTertiaryContainer = md_theme_dark_onTertiaryContainer,
        error = md_theme_dark_error,
        errorContainer = md_theme_dark_errorContainer,
        onError = md_theme_dark_onError,
        onErrorContainer = md_theme_dark_onErrorContainer,
        background = md_theme_dark_background,
        onBackground = md_theme_dark_onBackground,
        surface = md_theme_dark_surface,
        onSurface = md_theme_dark_onSurface,
        surfaceVariant = md_theme_dark_surfaceVariant,
        onSurfaceVariant = md_theme_dark_onSurfaceVariant,
        outline = md_theme_dark_outline,
        inverseOnSurface = md_theme_dark_inverseOnSurface,
        inverseSurface = md_theme_dark_inverseSurface,
        inversePrimary = md_theme_dark_inversePrimary,
        surfaceTint = md_theme_dark_surfaceTint,
        outlineVariant = md_theme_dark_outlineVariant,
        scrim = md_theme_dark_scrim,
    )
    return Pair(light, dark)
}
fun blue(): Pair<ColorScheme, ColorScheme> {
    val md_theme_light_primary = Color(0xFF006874)
    val md_theme_light_onPrimary = Color(0xFFFFFFFF)
    val md_theme_light_primaryContainer = Color(0xFF97F0FF)
    val md_theme_light_onPrimaryContainer = Color(0xFF001F24)
    val md_theme_light_secondary = Color(0xFF006874)
    val md_theme_light_onSecondary = Color(0xFFFFFFFF)
    val md_theme_light_secondaryContainer = Color(0xFF97F0FF)
    val md_theme_light_onSecondaryContainer = Color(0xFF001F24)
    val md_theme_light_tertiary = Color(0xFF00696D)
    val md_theme_light_onTertiary = Color(0xFFFFFFFF)
    val md_theme_light_tertiaryContainer = Color(0xFF6FF6FC)
    val md_theme_light_onTertiaryContainer = Color(0xFF002021)
    val md_theme_light_error = Color(0xFFBA1A1A)
    val md_theme_light_errorContainer = Color(0xFFFFDAD6)
    val md_theme_light_onError = Color(0xFFFFFFFF)
    val md_theme_light_onErrorContainer = Color(0xFF410002)
    val md_theme_light_background = Color(0xFFF8FDFF)
    val md_theme_light_onBackground = Color(0xFF001F25)
    val md_theme_light_surface = Color(0xFFF8FDFF)
    val md_theme_light_onSurface = Color(0xFF001F25)
    val md_theme_light_surfaceVariant = Color(0xFFDBE4E6)
    val md_theme_light_onSurfaceVariant = Color(0xFF3F484A)
    val md_theme_light_outline = Color(0xFF6F797A)
    val md_theme_light_inverseOnSurface = Color(0xFFD6F6FF)
    val md_theme_light_inverseSurface = Color(0xFF00363F)
    val md_theme_light_inversePrimary = Color(0xFF4FD8EB)
    val md_theme_light_shadow = Color(0xFF000000)
    val md_theme_light_surfaceTint = Color(0xFF006874)
    val md_theme_light_outlineVariant = Color(0xFFBFC8CA)
    val md_theme_light_scrim = Color(0xFF000000)

    val md_theme_dark_primary = Color(0xFF4FD8EB)
    val md_theme_dark_onPrimary = Color(0xFF00363D)
    val md_theme_dark_primaryContainer = Color(0xFF004F58)
    val md_theme_dark_onPrimaryContainer = Color(0xFF97F0FF)
    val md_theme_dark_secondary = Color(0xFF4FD8EB)
    val md_theme_dark_onSecondary = Color(0xFF00363D)
    val md_theme_dark_secondaryContainer = Color(0xFF004F58)
    val md_theme_dark_onSecondaryContainer = Color(0xFF97F0FF)
    val md_theme_dark_tertiary = Color(0xFF4CD9DF)
    val md_theme_dark_onTertiary = Color(0xFF003739)
    val md_theme_dark_tertiaryContainer = Color(0xFF004F52)
    val md_theme_dark_onTertiaryContainer = Color(0xFF6FF6FC)
    val md_theme_dark_error = Color(0xFFFFB4AB)
    val md_theme_dark_errorContainer = Color(0xFF93000A)
    val md_theme_dark_onError = Color(0xFF690005)
    val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
    val md_theme_dark_background = Color(0xFF001F25)
    val md_theme_dark_onBackground = Color(0xFFA6EEFF)
    val md_theme_dark_surface = Color(0xFF001F25)
    val md_theme_dark_onSurface = Color(0xFFA6EEFF)
    val md_theme_dark_surfaceVariant = Color(0xFF3F484A)
    val md_theme_dark_onSurfaceVariant = Color(0xFFBFC8CA)
    val md_theme_dark_outline = Color(0xFF899294)
    val md_theme_dark_inverseOnSurface = Color(0xFF001F25)
    val md_theme_dark_inverseSurface = Color(0xFFA6EEFF)
    val md_theme_dark_inversePrimary = Color(0xFF006874)
    val md_theme_dark_shadow = Color(0xFF000000)
    val md_theme_dark_surfaceTint = Color(0xFF4FD8EB)
    val md_theme_dark_outlineVariant = Color(0xFF3F484A)
    val md_theme_dark_scrim = Color(0xFF000000)

    val seed = Color(0xFF282828)

    val light = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val dark = darkColorScheme(
        primary = md_theme_dark_primary,
        onPrimary = md_theme_dark_onPrimary,
        primaryContainer = md_theme_dark_primaryContainer,
        onPrimaryContainer = md_theme_dark_onPrimaryContainer,
        secondary = md_theme_dark_secondary,
        onSecondary = md_theme_dark_onSecondary,
        secondaryContainer = md_theme_dark_secondaryContainer,
        onSecondaryContainer = md_theme_dark_onSecondaryContainer,
        tertiary = md_theme_dark_tertiary,
        onTertiary = md_theme_dark_onTertiary,
        tertiaryContainer = md_theme_dark_tertiaryContainer,
        onTertiaryContainer = md_theme_dark_onTertiaryContainer,
        error = md_theme_dark_error,
        errorContainer = md_theme_dark_errorContainer,
        onError = md_theme_dark_onError,
        onErrorContainer = md_theme_dark_onErrorContainer,
        background = md_theme_dark_background,
        onBackground = md_theme_dark_onBackground,
        surface = md_theme_dark_surface,
        onSurface = md_theme_dark_onSurface,
        surfaceVariant = md_theme_dark_surfaceVariant,
        onSurfaceVariant = md_theme_dark_onSurfaceVariant,
        outline = md_theme_dark_outline,
        inverseOnSurface = md_theme_dark_inverseOnSurface,
        inverseSurface = md_theme_dark_inverseSurface,
        inversePrimary = md_theme_dark_inversePrimary,
        surfaceTint = md_theme_dark_surfaceTint,
        outlineVariant = md_theme_dark_outlineVariant,
        scrim = md_theme_dark_scrim,
    )
    return Pair(light, dark)
}
fun dracula(): Pair<ColorScheme, ColorScheme> {
    val md_theme_light_primary = Color(0xFF4758A9)
    val md_theme_light_onPrimary = Color(0xFFFFFFFF)
    val md_theme_light_primaryContainer = Color(0xFFDDE1FF)
    val md_theme_light_onPrimaryContainer = Color(0xFF001257)
    val md_theme_light_secondary = Color(0xFF5A5D72)
    val md_theme_light_onSecondary = Color(0xFFFFFFFF)
    val md_theme_light_secondaryContainer = Color(0xFFDFE1F9)
    val md_theme_light_onSecondaryContainer = Color(0xFF171B2C)
    val md_theme_light_tertiary = Color(0xFF76546E)
    val md_theme_light_onTertiary = Color(0xFFFFFFFF)
    val md_theme_light_tertiaryContainer = Color(0xFFFFD7F2)
    val md_theme_light_onTertiaryContainer = Color(0xFF2D1228)
    val md_theme_light_error = Color(0xFFBA1A1A)
    val md_theme_light_errorContainer = Color(0xFFFFDAD6)
    val md_theme_light_onError = Color(0xFFFFFFFF)
    val md_theme_light_onErrorContainer = Color(0xFF410002)
    val md_theme_light_background = Color(0xFFFEFBFF)
    val md_theme_light_onBackground = Color(0xFF1B1B1F)
    val md_theme_light_surface = Color(0xFFFEFBFF)
    val md_theme_light_onSurface = Color(0xFF1B1B1F)
    val md_theme_light_surfaceVariant = Color(0xFFE3E1EC)
    val md_theme_light_onSurfaceVariant = Color(0xFF45464F)
    val md_theme_light_outline = Color(0xFF767680)
    val md_theme_light_inverseOnSurface = Color(0xFFF3F0F4)
    val md_theme_light_inverseSurface = Color(0xFF303034)
    val md_theme_light_inversePrimary = Color(0xFFB9C3FF)
    val md_theme_light_shadow = Color(0xFF000000)
    val md_theme_light_surfaceTint = Color(0xFF4758A9)
    val md_theme_light_outlineVariant = Color(0xFFC6C5D0)
    val md_theme_light_scrim = Color(0xFF000000)

    val md_theme_dark_primary = Color(0xFFB9C3FF)
    val md_theme_dark_onPrimary = Color(0xFF132778)
    val md_theme_dark_primaryContainer = Color(0xFF2E4090)
    val md_theme_dark_onPrimaryContainer = Color(0xFFDDE1FF)
    val md_theme_dark_secondary = Color(0xFFC3C5DD)
    val md_theme_dark_onSecondary = Color(0xFF2C2F42)
    val md_theme_dark_secondaryContainer = Color(0xFF434659)
    val md_theme_dark_onSecondaryContainer = Color(0xFFDFE1F9)
    val md_theme_dark_tertiary = Color(0xFFE5BAD8)
    val md_theme_dark_onTertiary = Color(0xFF44263E)
    val md_theme_dark_tertiaryContainer = Color(0xFF5C3C55)
    val md_theme_dark_onTertiaryContainer = Color(0xFFFFD7F2)
    val md_theme_dark_error = Color(0xFFFFB4AB)
    val md_theme_dark_errorContainer = Color(0xFF93000A)
    val md_theme_dark_onError = Color(0xFF690005)
    val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
    val md_theme_dark_background = Color(0xFF1B1B1F)
    val md_theme_dark_onBackground = Color(0xFFE4E1E6)
    val md_theme_dark_surface = Color(0xFF1B1B1F)
    val md_theme_dark_onSurface = Color(0xFFE4E1E6)
    val md_theme_dark_surfaceVariant = Color(0xFF45464F)
    val md_theme_dark_onSurfaceVariant = Color(0xFFC6C5D0)
    val md_theme_dark_outline = Color(0xFF90909A)
    val md_theme_dark_inverseOnSurface = Color(0xFF1B1B1F)
    val md_theme_dark_inverseSurface = Color(0xFFE4E1E6)
    val md_theme_dark_inversePrimary = Color(0xFF4758A9)
    val md_theme_dark_shadow = Color(0xFF000000)
    val md_theme_dark_surfaceTint = Color(0xFFB9C3FF)
    val md_theme_dark_outlineVariant = Color(0xFF45464F)
    val md_theme_dark_scrim = Color(0xFF000000)

    val seed = Color(0xFF44475A)

    val light = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val dark = darkColorScheme(
        primary = md_theme_dark_primary,
        onPrimary = md_theme_dark_onPrimary,
        primaryContainer = md_theme_dark_primaryContainer,
        onPrimaryContainer = md_theme_dark_onPrimaryContainer,
        secondary = md_theme_dark_secondary,
        onSecondary = md_theme_dark_onSecondary,
        secondaryContainer = md_theme_dark_secondaryContainer,
        onSecondaryContainer = md_theme_dark_onSecondaryContainer,
        tertiary = md_theme_dark_tertiary,
        onTertiary = md_theme_dark_onTertiary,
        tertiaryContainer = md_theme_dark_tertiaryContainer,
        onTertiaryContainer = md_theme_dark_onTertiaryContainer,
        error = md_theme_dark_error,
        errorContainer = md_theme_dark_errorContainer,
        onError = md_theme_dark_onError,
        onErrorContainer = md_theme_dark_onErrorContainer,
        background = md_theme_dark_background,
        onBackground = md_theme_dark_onBackground,
        surface = md_theme_dark_surface,
        onSurface = md_theme_dark_onSurface,
        surfaceVariant = md_theme_dark_surfaceVariant,
        onSurfaceVariant = md_theme_dark_onSurfaceVariant,
        outline = md_theme_dark_outline,
        inverseOnSurface = md_theme_dark_inverseOnSurface,
        inverseSurface = md_theme_dark_inverseSurface,
        inversePrimary = md_theme_dark_inversePrimary,
        surfaceTint = md_theme_dark_surfaceTint,
        outlineVariant = md_theme_dark_outlineVariant,
        scrim = md_theme_dark_scrim,
    )
    return Pair(light, dark)
}

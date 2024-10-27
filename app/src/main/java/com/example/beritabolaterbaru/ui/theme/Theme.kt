package com.example.beritabolaterbaru.ui.theme

// Import yang dibutuhkan untuk tema dan UI
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Skema warna untuk tema gelap
private val DarkColorScheme = darkColorScheme(
    surfaceVariant = md_theme_dark_surfaceVariant, // Warna latar permukaan dalam tema gelap
    onSurfaceVariant = md_theme_dark_onSurfaceVariant, // Warna teks pada latar permukaan
    background = md_theme_dark_background // Warna latar utama dalam tema gelap
)

// Skema warna untuk tema terang
private val LightColorScheme = lightColorScheme(
    surfaceVariant = md_theme_light_surfaceVariant, // Warna latar permukaan dalam tema terang
    onSurfaceVariant = md_theme_light_onSurfaceVariant, // Warna teks pada latar permukaan
    background = md_theme_light_background // Warna latar utama dalam tema terang
)

// Fungsi tema utama aplikasi
@Composable
fun BeritaBolaTerbaruTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Mengatur tema berdasarkan pengaturan sistem
    dynamicColor: Boolean = false, // Menentukan apakah tema dinamis digunakan atau tidak
    content: @Composable () -> Unit // Konten dalam tema ini
) {
    // Pilih skema warna berdasarkan kondisi tema dinamis atau tema gelap/terang
    val colorScheme = when {
        // Jika tema dinamis aktif dan versi Android mendukung, gunakan tema dinamis
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        // Jika tema gelap, gunakan skema warna gelap
        darkTheme -> DarkColorScheme
        // Jika tidak, gunakan skema warna terang
        else -> LightColorScheme
    }

    // Mendapatkan view dari konteks lokal
    val view = LocalView.current
    if (!view.isInEditMode) { // Hanya dijalankan jika bukan dalam mode edit
        SideEffect {
            // Mengubah warna status bar sesuai dengan warna latar tema
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            // Mengatur warna ikon status bar berdasarkan apakah tema gelap atau terang
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    // Mengaplikasikan MaterialTheme dengan skema warna yang dipilih
    MaterialTheme(
        colorScheme = colorScheme,
        content = content // Menampilkan konten dalam tema ini
    )
}

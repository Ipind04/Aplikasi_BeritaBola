package com.example.beritabolaterbaru.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Skema warna untuk tema terang aplikasi.
 *
 * Menentukan warna utama, warna latar belakang, dan warna lainnya
 * yang digunakan dalam antarmuka pengguna aplikasi.
 */
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE), // Warna utama aplikasi (ungu)
    onPrimary = Color.White, // Warna teks atau elemen di atas warna utama
    secondary = Color(0xFF03DAC6), // Warna sekunder aplikasi (cyan)
    onSecondary = Color.Black, // Warna teks atau elemen di atas warna sekunder
    background = Color(0xFFF5F5F5), // Warna latar belakang aplikasi
    onBackground = Color.Black, // Warna teks atau elemen di atas latar belakang
    surface = Color(0xFFFFFFFF), // Warna permukaan (untuk kartu dan elemen lainnya)
    onSurface = Color.Black, // Warna teks atau elemen di atas permukaan
    error = Color(0xFFB00020), // Warna untuk menunjukkan kesalahan
    onError = Color.White // Warna teks atau elemen di atas warna kesalahan
)

/**
 * Fungsi tema untuk aplikasi Berita Bola Terbaru.
 *
 * @param content Konten yang akan dirender dengan tema yang ditentukan.
 */
@Composable
fun BeritaBolaTerbaruTheme(
    content: @Composable () -> Unit // Konten composable yang ingin diterapkan tema
) {
    MaterialTheme(
        colorScheme = LightColorScheme, // Menggunakan skema warna terang
        typography = Typography, // Menggunakan tipografi yang ditentukan (pastikan Typography didefinisikan)
        content = content // Menyediakan konten untuk ditampilkan
    )
}
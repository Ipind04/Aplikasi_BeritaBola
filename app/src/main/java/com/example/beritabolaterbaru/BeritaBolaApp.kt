package com.example.beritabolaterbaru

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.beritabolaterbaru.ui.theme.data.Data

/**
 * Fungsi composable untuk aplikasi Berita Bola.
 *
 * @param navController Kontrol untuk navigasi antar layar dalam aplikasi.
 */
@Composable
fun BeritaBolaApp(navController: NavController) {
    // Memuat daftar berita bola terbaru menggunakan kelas Data
    val beritabolaterbaruList = Data().loadBeritaBolaTerbaru()

    // Menggunakan Column untuk menyusun elemen secara vertikal
    Column {
        // Menampilkan daftar berita bola terbaru
        AffirmationList(
            beritabolaterbaruList = beritabolaterbaruList, // Daftar berita yang akan ditampilkan
            onDetailClick = { detail ->
                // Menangani klik pada detail berita dan melakukan navigasi ke layar detail
                navController.navigate("detail/$detail") // Navigasi ke layar detail
            }
        )
    }
}
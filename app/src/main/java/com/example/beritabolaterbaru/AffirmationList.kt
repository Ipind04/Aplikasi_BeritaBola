package com.example.beritabolaterbaru

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru

/**
 * Fungsi composable untuk menampilkan daftar berita bola terbaru.
 *
 * @param beritabolaterbaruList Daftar objek BeritaBolaTerbaru yang akan ditampilkan.
 * @param onDetailClick Lambda yang dipanggil ketika detail berita diklik,
 * menerima parameter String yang dapat digunakan untuk menampilkan detail berita.
 * @param modifier Modifier opsional untuk menyesuaikan tampilan.
 */
@Composable
fun AffirmationList(
    beritabolaterbaruList: List<BeritaBolaTerbaru>, // Daftar berita yang akan ditampilkan
    onDetailClick: (String) -> Unit, // Callback untuk menangani klik pada detail
    modifier: Modifier = Modifier // Modifier opsional untuk penyesuaian tampilan
) {
    // Menggunakan LazyColumn untuk menampilkan daftar yang dapat digulir
    LazyColumn(modifier = modifier) {
        // Mengiterasi setiap item dalam beritabolaterbaruList
        items(beritabolaterbaruList) { beritabolaterbaru ->
            // Menampilkan kartu berita untuk setiap item
            BeritaBolaCard(
                beritabolaterbaru = beritabolaterbaru, // Mengirimkan berita ke komponen kartu
                onDetailClick = onDetailClick, // Mengirimkan callback klik
                modifier = Modifier.padding(8.dp) // Menambahkan padding di sekitar kartu
            )
        }
    }
}
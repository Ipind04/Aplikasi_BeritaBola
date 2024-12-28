package com.example.beritabolaterbaru

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru
import androidx.compose.material3.TopAppBar as TopAppBar1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailBeritaScreen(berita: BeritaBolaTerbaru, onBackClick: () -> Unit) {
    // Menggunakan Scaffold untuk struktur dasar layar
    Scaffold(
        topBar = {
            TopAppBar1(
                title = { Text("Detail Berita") }, // Judul untuk TopAppBar
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        // Ikon untuk kembali
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back" // Deskripsi untuk aksesibilitas
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        // Menggunakan Column untuk menyusun elemen secara vertikal
        Column(
            modifier = Modifier
                .fillMaxSize() // Mengisi ukuran maksimum layar
                .padding(innerPadding) // Padding dari Scaffold
                .padding(16.dp) // Padding tambahan di sekitar konten
        ) {
            // Menampilkan gambar berita
            Image(
                painter = painterResource(berita.imageResourceId), // Mengambil gambar dari sumber daya
                contentDescription = stringResource(berita.stringResourceId), // Deskripsi gambar
                modifier = Modifier
                    .fillMaxWidth() // Mengisi lebar maksimum
                    .height(200.dp), // Mengatur tinggi gambar
                contentScale = ContentScale.Crop // Memotong gambar agar sesuai ukuran
            )
            Spacer(modifier = Modifier.height(16.dp)) // Jarak antara gambar dan judul
            // Menampilkan judul berita
            Text(
                text = stringResource(berita.stringResourceId), // Mengambil teks judul dari sumber daya
                style = MaterialTheme.typography.titleLarge, // Gaya teks untuk judul
                textAlign = TextAlign.Center // Menyelaraskan teks ke tengah
            )
            Spacer(modifier = Modifier.height(8.dp)) // Jarak antara judul dan detail
            // Menampilkan detail berita
            Text(
                text = berita.detail, // Menampilkan detail berita
                style = MaterialTheme.typography.bodyLarge // Gaya teks untuk detail
            )
        }
    }
}
package com.example.beritabolaterbaru

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru

/**
 * Fungsi composable untuk menampilkan kartu berita bola.
 *
 * @param beritabolaterbaru Objek BeritaBolaTerbaru yang berisi informasi berita.
 * @param onDetailClick Lambda yang dipanggil ketika pengguna mengklik "Selengkapnya".
 * @param modifier Modifier opsional untuk penyesuaian tampilan.
 */
@Composable
fun BeritaBolaCard(
    beritabolaterbaru: BeritaBolaTerbaru, // Berita yang ditampilkan
    onDetailClick: (String) -> Unit, // Callback untuk menangani klik pada "Selengkapnya"
    modifier: Modifier = Modifier // Modifier opsional untuk penyesuaian tampilan
) {
    // Membuat kartu untuk menampilkan berita
    Card(modifier = modifier) {
        Column {
            // Menampilkan gambar berita
            Image(
                painter = painterResource(beritabolaterbaru.imageResourceId), // Mengambil gambar dari sumber daya
                contentDescription = stringResource(beritabolaterbaru.stringResourceId), // Deskripsi gambar
                modifier = Modifier
                    .fillMaxWidth() // Mengisi lebar maksimum
                    .height(194.dp), // Mengatur tinggi gambar
                contentScale = ContentScale.Crop // Memotong gambar agar sesuai dengan ukuran
            )

            // Membuat teks yang dapat diklik dengan anotasi
            val annotatedString = buildAnnotatedString {
                append(stringResource(beritabolaterbaru.stringResourceId)) // Menambahkan judul berita
                append(" ") // Menambahkan spasi
                pushStringAnnotation(tag = "selengkapnya", annotation = "selengkapnya") // Menambahkan anotasi
                withStyle(
                    style = MaterialTheme.typography.bodyMedium.toSpanStyle().copy(
                        color = MaterialTheme.colorScheme.primary // Mengatur warna teks
                    )
                ) {
                    append("Selengkapnya") // Menambahkan teks "Selengkapnya"
                }
                pop() // Menghapus anotasi
            }

            // Menampilkan teks yang dapat diklik
            ClickableText(
                text = annotatedString, // Teks yang akan ditampilkan
                modifier = Modifier.padding(16.dp), // Menambahkan padding di sekitar teks
                style = MaterialTheme.typography.bodyMedium, // Mengatur gaya teks
                onClick = { offset ->
                    // Cek apakah klik terjadi pada "Selengkapnya"
                    annotatedString.getStringAnnotations("selengkapnya", start = offset, end = offset)
                        .firstOrNull()?.let {
                            onDetailClick(beritabolaterbaru.id.toString()) // Panggil callback jika klik pada "Selengkapnya"
                        }
                }
            )
        }
    }
}
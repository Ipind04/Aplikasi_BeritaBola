package com.example.beritabolaterbaru

// Import library yang diperlukan untuk membuat Activity, Intent, UI Compose, dll.
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beritabolaterbaru.ui.theme.data.Data
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru
import com.example.beritabolaterbaru.ui.theme.BeritaBolaTerbaruTheme

// Kelas utama untuk aplikasi ini, menggunakan ComponentActivity untuk membuat aktivitas utama
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Menerapkan tema aplikasi ketika konten dipasang di layar
            BeritaBolaTerbaruTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Memanggil fungsi utama aplikasi
                    BeritaBolaApp()
                }
            }
        }
    }
}

// Fungsi utama aplikasi yang akan menampilkan daftar berita bola
@Composable
fun BeritaBolaApp() {
    // Memanggil fungsi AffirmationList untuk menampilkan daftar berita bola
    AffirmationList(
        beritabolaterbaruList = Data().loadBeritaBolaTerbaru(),
    )
}

// Fungsi untuk menampilkan daftar berita bola dalam bentuk LazyColumn
@Composable
fun AffirmationList(beritabolaterbaruList: List<BeritaBolaTerbaru>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        // Menggunakan items untuk iterasi setiap item di dalam beritabolaterbaruList
        items(beritabolaterbaruList) { beritabolaterbaru ->
            // Memanggil fungsi BeritaBolaCard untuk menampilkan setiap item dalam Card
            BeritaBolaCard(
                beritabolaterbaru = beritabolaterbaru,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

// Fungsi untuk menampilkan detail setiap berita dalam Card
@Composable
fun BeritaBolaCard(beritabolaterbaru: BeritaBolaTerbaru, modifier: Modifier = Modifier) {
    val context = LocalContext.current // Mendapatkan konteks untuk akses ke activity atau intent

    // Menggunakan Card untuk setiap item berita bola
    Card(modifier = modifier) {
        Column {
            // Menampilkan gambar berita bola
            Image(
                painter = painterResource(beritabolaterbaru.imageResourceId),
                contentDescription = stringResource(beritabolaterbaru.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )

            // Membuat teks deskripsi berita dan "Selengkapnya" sebagai teks yang dapat diklik
            val annotatedString = buildAnnotatedString {
                append(context.getString(beritabolaterbaru.stringResourceId)) // Menambahkan teks utama berita
                append(" ")

                // Menambahkan teks "Selengkapnya" dengan hyperlink
                pushStringAnnotation(tag = "URL", annotation = beritabolaterbaru.url ?: "")
                withStyle(style = MaterialTheme.typography.bodyMedium.toSpanStyle().copy(
                    color = MaterialTheme.colorScheme.primary
                )) {
                    append("Selengkapnya") // Menampilkan teks "Selengkapnya" yang bisa diklik
                }
                pop()
            }

            // Menggunakan ClickableText untuk membuat teks yang bisa diklik
            ClickableText(
                text = annotatedString,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.bodyMedium,
                onClick = { offset ->
                    // Menangani klik pada teks "Selengkapnya" yang mengandung URL
                    annotatedString.getStringAnnotations(tag = "URL", start = offset, end = offset)
                        .firstOrNull()?.let { annotation ->
                            val url = annotation.item // Mendapatkan URL dari anotasi
                            if (!url.isNullOrEmpty()) {
                                // Membuka URL dalam browser jika valid
                                try {
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                    val chooser = Intent.createChooser(intent, "Buka dengan")
                                    context.startActivity(chooser)
                                } catch (e: Exception) {
                                    // Menampilkan pesan error jika URL tidak bisa dibuka
                                    Toast.makeText(context, "Tidak dapat membuka tautan", Toast.LENGTH_SHORT).show()
                                }
                            } else {
                                // Menampilkan pesan error jika URL kosong
                                Toast.makeText(context, "URL tidak valid", Toast.LENGTH_SHORT).show()
                            }
                        }
                }
            )
        }
    }
}

// Fungsi untuk menampilkan pratinjau UI di Android Studio
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BeritaBolaTerbaruTheme {
        BeritaBolaApp()
    }
}

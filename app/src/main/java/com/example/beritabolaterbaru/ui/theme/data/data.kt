package com.example.beritabolaterbaru.ui.theme.data

// Import resource string dan drawable untuk menggunakan ID teks dan gambar dari folder resources
import com.example.beritabolaterbaru.R
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru

// Kelas Data digunakan untuk memuat daftar berita bola terbaru
class Data {

    // Fungsi loadBeritaBolaTerbaru mengembalikan List<BeritaBolaTerbaru>
    fun loadBeritaBolaTerbaru(): List<BeritaBolaTerbaru> {
        return listOf(
            // Setiap BeritaBolaTerbaru berisi ID string, ID drawable, dan URL
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru1,                 // ID string untuk berita pertama
                R.drawable.real_madrid_vs_barcelona,        // ID drawable untuk gambar berita pertama
                "https://www.antaranews.com/berita/4422009/jadwal-liga-spanyol-ada-el-clasico-madrid-vs-barcelona" // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru2,                 // ID string untuk berita kedua
                R.drawable.timnasindonesia_u17,             // ID drawable untuk gambar berita kedua
                "https://www.bola.com/indonesia/read/5760389/" // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru3,                 // ID string untuk berita ketiga
                R.drawable.ciesha,                          // ID drawable untuk gambar berita ketiga
                "https://www.bola.net/inggris/dianggap-gagal-di-premier-league-federico-chiesa-lirik-opsi-balik-ke-italia-abb506.html" // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru4,                 // ID string untuk berita keempat
                R.drawable.barcelona,                       // ID drawable untuk gambar berita keempat
                "https://sport.detik.com/sepakbola/liga-spanyol/d-7605833/" // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru5,                 // ID string untuk berita kelima
                R.drawable.raphinha2,                       // ID drawable untuk gambar berita kelima
                "https://www.bola.net/s"                     // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru6,                 // ID string untuk berita keenam
                R.drawable.mu2,                             // ID drawable untuk gambar berita keenam
                "https://www.bola.net/inggris/0073ee.html"   // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru7,                 // ID string untuk berita ketujuh
                R.drawable.theo,                            // ID drawable untuk gambar berita ketujuh
                "https://www.acmilan.com/en"                // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru8,                 // ID string untuk berita kedelapan
                R.drawable.derby,                           // ID drawable untuk gambar berita kedelapan
                "https://www.bola.net/italia/fc0ef1.html"   // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru9,                 // ID string untuk berita kesembilan
                R.drawable.yamal,                           // ID drawable untuk gambar berita kesembilan
                "https://www.bola.net/spanyol/b2a75e.html"  // URL berita lengkap
            ),
            BeritaBolaTerbaru(
                R.string.beritabolaterbaru10,                // ID string untuk berita kesepuluh
                R.drawable.lewa,                            // ID drawable untuk gambar berita kesepuluh
                "https://sport.detik.com/sepakbola/liga-spanyol/d-7608188/real-madrid-vs-barcelona-los-blancos-dihajar-0-4" // URL berita lengkap
            )
        )
    }
}

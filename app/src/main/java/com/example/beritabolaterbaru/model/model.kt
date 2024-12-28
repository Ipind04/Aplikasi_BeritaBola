package com.example.beritabolaterbaru.model

/**
 * Data class yang merepresentasikan berita bola terbaru.
 *
 * @property id ID unik untuk setiap berita. Digunakan untuk membedakan setiap entri berita.
 * @property stringResourceId ID sumber daya string yang berisi teks judul berita.
 * @property imageResourceId ID sumber daya gambar yang merepresentasikan berita.
 * @property detail Deskripsi lengkap tentang berita, memberikan informasi lebih lanjut kepada pengguna.
 */
data class BeritaBolaTerbaru(
    val id: Int, // Tambahkan ID unik
    val stringResourceId: Int, // ID sumber daya string untuk judul berita
    val imageResourceId: Int, // ID sumber daya gambar untuk berita
    val detail: String // Deskripsi lengkap berita
)


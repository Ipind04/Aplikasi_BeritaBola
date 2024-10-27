package com.example.beritabolaterbaru.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Data class untuk menyimpan informasi berita bola terbaru
data class BeritaBolaTerbaru(
    // ID sumber daya string yang akan ditampilkan sebagai judul atau deskripsi berita
    @StringRes val stringResourceId: Int,

    // ID sumber daya gambar yang akan ditampilkan dalam berita
    @DrawableRes val imageResourceId: Int,

    // URL yang terkait dengan berita, dapat digunakan untuk membuka artikel lengkap
    val url: String
)

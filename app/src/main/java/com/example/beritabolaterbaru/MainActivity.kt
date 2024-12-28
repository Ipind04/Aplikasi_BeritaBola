package com.example.beritabolaterbaru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.beritabolaterbaru.ui.theme.BeritaBolaTerbaruTheme
import com.example.beritabolaterbaru.ui.theme.data.Data

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Menggunakan tema untuk aplikasi
            BeritaBolaTerbaruTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), // Mengisi ukuran maksimum layar
                    color = MaterialTheme.colorScheme.background // Mengatur warna latar belakang
                ) {
                    // Membuat kontrol navigasi
                    val navController = rememberNavController()
                    // Menggunakan NavHost untuk mengatur navigasi antar layar
                    NavHost(navController, startDestination = "home") {
                        composable("home") { BeritaBolaApp(navController) } // Layar utama aplikasi
                        composable("detail/{id}") { backStackEntry ->
                            // Mengambil ID dari argumen navigasi
                            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
                            // Memuat berita berdasarkan ID
                            val berita = Data().loadBeritaBolaTerbaru().find { it.id == id }
                            // Jika berita ditemukan, tampilkan DetailBeritaScreen
                            if (berita != null) {
                                DetailBeritaScreen(berita) {
                                    navController.navigateUp() // Kembali ke layar sebelumnya
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
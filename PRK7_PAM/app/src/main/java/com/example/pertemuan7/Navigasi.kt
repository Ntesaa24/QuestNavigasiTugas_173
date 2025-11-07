package com.example.pertemuan7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan7.view.FormulirPendaftaran
import com.example.pertemuan7.view.HalamanKedua
import com.example.pertemuan7.view.TampilanDepan

enum class Navigasi {
    tampilan,
    halaman,
    formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.tampilan.name,
            modifier = Modifier.padding(isiRuang)
        ) {

            // --- Halaman Depan ---
            composable(route = Navigasi.tampilan.name) {
                TampilanDepan(
                    onMasukClick = {
                        // Navigasi ke Halaman Kedua
                        navController.navigate(Navigasi.halaman.name)
                    }
                )
            }

            // --- List Peserta ---
            composable(route = Navigasi.halaman.name) {
                HalamanKedua(
                    onBackbtnClick = {
                        // Kembali ke Tampilan Depan
                        navController.navigate(Navigasi.tampilan.name) {
                            popUpTo(Navigasi.tampilan.name) { inclusive = true }
                        }
                    },
                    onFormClick = {
                        // Navigasi ke Formulir Pendaftaran
                        navController.navigate(Navigasi.formulir.name)
                    }
                )
            }

            // --- Form Pendaftaran ---
            composable(route = Navigasi.formulir.name) {
                FormulirPendaftaran(
                    onBackbtnClick = {
                        // Kembali ke Halaman Kedua
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}

// fungsi untuk kembali ke HalamanDepan
private fun cancelAndBackToBeranda(
    navController: NavHostController
) {
    navController.popBackStack(Navigasi.tampilan.name, inclusive = false)
}

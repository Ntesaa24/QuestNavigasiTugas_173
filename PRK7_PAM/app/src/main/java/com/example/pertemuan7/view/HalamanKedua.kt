package com.example.pertemuan7.view

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanKedua(
    modifier: Modifier,
    onBackBtnClick:()->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.white))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        //judul halaman
        Text(
            text = "List Daftar Peserta",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
                .height(height = 200.dp)
                .border(
                    width = 2.dp,
                    color = colorResource(id = R.color.black),
                    shape = RoundedCornerShape(16.dp)
                ),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray)
        ) {
            Row {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text("Nama Lengkap", fontWeight = FontWeight.Bold)
                    Text("Dzaki Radit")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("STATUS KAWIN", fontWeight = FontWeight.Bold)
                    Text("Single")
                }

                Spacer(modifier = Modifier.height(20.dp))

                Column(modifier = Modifier.padding(20.dp)) {
                    Text("JENIS KELAMIN", fontWeight = FontWeight.Bold)
                    Text("Laki-laki")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("ALAMAT", fontWeight = FontWeight.Bold)
                    Text("Bandung")
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
                .height(height = 200.dp)
                .border(
                    width = 2.dp,
                    color = colorResource(id = R.color.black),
                    shape = RoundedCornerShape(16.dp)
                ),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray)
        ) {
            Row {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text("Nama Lengkap", fontWeight = FontWeight.Bold)
                    Text("Nesa Destian")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("STATUS KAWIN", fontWeight = FontWeight.Bold)
                    Text("Kawin")
                }

                Spacer(modifier = Modifier.height(20.dp))

                Column(modifier = Modifier.padding(20.dp)) {
                    Text("JENIS KELAMIN", fontWeight = FontWeight.Bold)
                    Text("Perempuan")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("ALAMAT", fontWeight = FontWeight.Bold)
                    Text("Jakarta")
                }
            }
        }

        Spacer(modifier = Modifier.height(100.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { onBackBtnClick() },
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Beranda")
            }

            Button(
                onClick = { onBackBtnClick() },
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Formulir")
            }
        }
    }
}



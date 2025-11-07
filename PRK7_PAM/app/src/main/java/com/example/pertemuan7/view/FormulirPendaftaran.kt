package com.example.pertemuan7.view
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan7.R

@Composable
fun FormulirPendaftaran (onBackbtnClick: () -> Unit,
                         modifier: Modifier = Modifier){

    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatusPerkawinan by remember { mutableStateOf("") }

    var showDialog by remember { mutableStateOf(false) }

    //variable-variable untuk menyimpan data yang di peroleh dari komponen UI
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val kawin:List<String> = listOf("Janda", "Lajang", "Duda")
    val gender:List<String> = listOf("Laki-laki", "Perempuan")

    Column(
        modifier = Modifier.padding(top = 30.dp, bottom = 15.dp)){
        Text(
            text = "Formulir Pendaftaran",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.pink_tua),
            fontFamily = FontFamily.Serif, modifier = Modifier.padding(10.dp)
        )
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.pink_tua)
            )
        ){
            Text(
                text = "NAMA LENGKAP",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Start)
                    .padding(top = 10.dp, start = 10.dp)
            )
            OutlinedTextField(
                value = textNama,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp),
                label = { Text(text = "Nama Lengkap", color = Color.DarkGray) },
                onValueChange = { textNama = it }
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "JENIS KELAMIN",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 9.dp, start = 9.dp)
            )

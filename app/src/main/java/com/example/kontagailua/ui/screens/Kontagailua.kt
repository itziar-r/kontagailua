package com.example.kontagailua.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.example.kontagailua.viewmodel.KontagailuViewModel

@Composable
fun KontagailuaScreen (viewModel: KontagailuViewModel) {

    val kontagailua = viewModel.kontagailua.collectAsState()

    Column () {
        Text (
            text = "Kontagailua"
        )
        Text (
            text = "balioa"
        )
        Row() {
            Button(onClick = {viewModel.kontagailuaHanditu()}) { Text (text = "+")}
            Button(onClick = {viewModel.kontagailuaMurriztu()}) { Text (text = "-")}
        }
    }
}
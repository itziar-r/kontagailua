package com.example.kontagailua.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.kontagailua.viewmodel.KontagailuViewModel

@Composable
fun KontagailuaScreen(viewModel: KontagailuViewModel, modifier: Modifier) {

    val kontagailua = viewModel.kontagailua.collectAsState()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.outline, RectangleShape),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Kontagailua",
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = kontagailua.value.toString(),
            style = MaterialTheme.typography.titleLarge
        )
        Row() {
            Button(onClick = { viewModel.kontagailuaHanditu() }) { Text(text = "+") }
            Spacer (Modifier.width(8.dp))
            Button(onClick = { viewModel.kontagailuaMurriztu() }) { Text(text = "-") }
        }
    }
}
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

    val kontagailuak = viewModel.kontagailuak.collectAsState().value
    Column(
        modifier = modifier
            .fillMaxWidth()
    )
    {
        KontagailuItem(
            "Kontagailua 1",
            kontagailuak.getOrNull(0) ?: 0,
            { viewModel.kontagailuaHanditu(0) },
            { viewModel.kontagailuaMurriztu(0) }
        )
        KontagailuItem(
                "Kontagailua 2",
        kontagailuak.getOrNull(1) ?: 0,
        { viewModel.kontagailuaHanditu(1) },
        { viewModel.kontagailuaMurriztu(1) }
        )
        KontagailuItem(
            "Kontagailua 3",
            kontagailuak.getOrNull(2) ?: 0,
            { viewModel.kontagailuaHanditu(2) },
            { viewModel.kontagailuaMurriztu(2) }
        )
    }

}

@Composable
fun KontagailuItem(
    izenburua: String,
    balioa: Int,
    onHanditu: () -> Unit,
    onMurriztu: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.outline, RectangleShape),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = izenburua,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = balioa.toString(),
            style = MaterialTheme.typography.titleLarge
        )
        Row {
            Button(onClick = onHanditu) { Text(text = "+") }
            Spacer(Modifier.width(8.dp))
            Button(onClick = onMurriztu) { Text(text = "-") }
        }
    }
}
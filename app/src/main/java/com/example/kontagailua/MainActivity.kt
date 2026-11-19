package com.example.kontagailua
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.kontagailua.ui.screens.KontagailuaScreen
import com.example.kontagailua.ui.theme.KontagailuaTheme
import com.example.kontagailua.viewmodel.KontagailuViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KontagailuaTheme {
                val vm = KontagailuViewModel()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    KontagailuaScreen(vm, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

package com.example.kontagailua.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class KontagailuViewModel : ViewModel() {

    private val _kontagailua = MutableStateFlow (0)

    val kontagailua : StateFlow<Int> = _kontagailua

    fun kontagailuaHanditu() {
        _kontagailua.value += 1
    }

    fun kontagailuaMurriztu() {
        _kontagailua.value -= 1
    }

}
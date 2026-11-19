package com.example.kontagailua.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class KontagailuViewModel : ViewModel() {

    private val _kontagailuak = MutableStateFlow(List(3) { 0 })

    val kontagailuak: StateFlow<List<Int>> = _kontagailuak

    fun kontagailuaHanditu(index: Int) {
        _kontagailuak.update { list ->
            list.toMutableList().also { it[index] = it[index] + 1 }
        }

    }

    fun kontagailuaMurriztu(index: Int) {
        _kontagailuak.update { list ->
            list.toMutableList().also { it[index] = it[index] - 1 }
        }
    }

}
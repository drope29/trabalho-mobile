package com.example.contador

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {

    private var contador = 0
    private val _contadorLiveData = MutableLiveData<Int>()
    val contadorLiveData: LiveData<Int> = _contadorLiveData

    init {
        _contadorLiveData.value = contador
    }

    fun incrementar() {
        contador++
        _contadorLiveData.value = contador
    }
}

package com.example.contador

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ContadorViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: ContadorViewModel

    @Before
    fun setup() {
        viewModel = ContadorViewModel()
    }

    @Test
    fun `incrementar aumenta o valor do contador`() {
        // When
        viewModel.incrementar()

        // Then
        val valor = viewModel.contadorLiveData.value
        assertEquals(1, valor)
    }
}

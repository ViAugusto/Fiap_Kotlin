package com.example.modulo_1.data

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Aluguel(val carro: Carro, val cliente: Cliente, val dataInicio: LocalDate, var dataFim: LocalDate) {
    val total: Double
        get() = ChronoUnit.DAYS.between(dataInicio, dataFim).toDouble() * carro.diaria
}
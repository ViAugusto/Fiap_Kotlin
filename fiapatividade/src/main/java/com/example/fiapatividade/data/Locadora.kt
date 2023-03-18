package com.example.fiapatividade.data

import java.time.LocalDate

class Locadora(val carros: MutableList<Carro>) {
    val alugueis = mutableListOf<Aluguel>()

    fun alugarCarro(carro: Carro, cliente: Cliente, dataInicio: LocalDate, dataFim: LocalDate) {
        if (!carro.disponivel) {
            throw Exception("Carro não está disponível para aluguel.")
        }

        alugueis.add(Aluguel(carro, cliente, dataInicio, dataFim))
        carro.disponivel = false
        cliente.historico.add(alugueis.last())
    }

    fun devolverCarro(carro: Carro, data: LocalDate) {
        val aluguel = alugueis.findLast { it.carro == carro && it.dataFim == null }
            ?: throw Exception("Carro não está alugado.")

        aluguel.dataFim = data
        carro.disponivel = true
    }
}
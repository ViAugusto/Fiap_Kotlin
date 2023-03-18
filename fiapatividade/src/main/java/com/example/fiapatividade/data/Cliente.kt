package com.example.fiapatividade.data

class Cliente(val nome: String, val idade: Int, val cnh: String) {
    val historico = mutableListOf<Aluguel>()
}
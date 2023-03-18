package com.example.modulo_1.data

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Rental(val car: Car, val startDate: LocalDate, val endDate: LocalDate) {
    val duration: Int = ChronoUnit.DAYS.between(startDate, endDate).toInt()
    val totalCost: Double = car.dailyRate * duration
}
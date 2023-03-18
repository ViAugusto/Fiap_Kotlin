package com.example.modulo_1.data

class Customer(val name: String, val driverLicenseNumber: String, val rentals: MutableList<Rental> = mutableListOf())
package com.example.modulo_1.data

import java.time.LocalDate

class CarRental {
    private val cars = mutableListOf<Car>()
    val customers = mutableListOf<Customer>()

    fun addCar(car: Car) {
        cars.add(car)
    }

    fun addCustomer(customer: Customer) {
        customers.add(customer)
    }

    fun rentCar(customer: Customer, car: Car, startDate: LocalDate, endDate: LocalDate) {
        if (!car.isAvailable) {
            throw IllegalStateException("Car is not available for rental")
        }

        val rental = Rental(car, startDate, endDate)
        customer.rentals.add(rental)
        car.isAvailable = false
    }

    fun returnCar(customer: Customer, rental: Rental) {
        val car = rental.car

        if (!car.isAvailable) {
            throw IllegalStateException("Car is not rented by customer")
        }

        customer.rentals.remove(rental)
        car.isAvailable = true
    }
}
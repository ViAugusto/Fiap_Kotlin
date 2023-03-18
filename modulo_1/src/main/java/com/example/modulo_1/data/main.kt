package com.example.modulo_1.data

import java.time.LocalDate


fun main() {
    val rentalService = CarRental()

    // add some cars to the service
    val car1 = Car("Toyota", "Corolla", 2021, 50.0, true)
    val car2 = Car("Honda", "Civic", 2021, 60.0, true)
    rentalService.addCar(car1)
    rentalService.addCar(car2)

    // add some customers to the service
    val customer1 = Customer("John Doe", "1234")
    val customer2 = Customer("Jane Doe", "5678")
    rentalService.addCustomer(customer1)
    rentalService.addCustomer(customer2)

    // rent a car to a customer
    rentalService.rentCar(customer1, car1, LocalDate.now(), LocalDate.now().plusDays(3))

    // return a car from a customer
    val rental = customer1.rentals.first()
    rentalService.returnCar(customer1, rental)

    // calculate total revenue for the rental service
    val totalRevenue = rentalService.customers.flatMap { it.rentals }.sumOf { it.totalCost }
    println("Total revenue: $totalRevenue")
}
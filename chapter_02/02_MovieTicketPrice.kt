package chapter_02

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age) {
        // Children's price: 0 to 12 years old
        in 0..12 -> 15

        // Standard price: 13 to 60 years old
        in 13..60 -> if (isMonday) 25 else 30

        // Senior price: 61 to 100 years old
        in 61..100 -> 20

        // Invalid age
        else -> -1
    }
}
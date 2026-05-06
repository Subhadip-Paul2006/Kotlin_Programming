package chapter_03

fun main() {
    val x = 3

    // 'when' check karta hai ki 'x' ki value kis category mein fit baithti hai
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}

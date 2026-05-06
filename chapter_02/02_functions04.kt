package chapter_02

fun main() {
    val message = dayGreeting()
    println(message)
}

fun dayGreeting(): String {
    val name = "Rover"
    val age = 5
    return "Happy Birthday, $name! You are $age years old!"
}
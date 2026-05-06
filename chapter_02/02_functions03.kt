package chapter_02

fun main() {
    bGreeting("TRex", 2) // Function call with arguments
}

fun bGreeting(name: String, age: Int) { // variableName : Parameters
    println("Happy Birthday, $name!")
    println("You are now $age years old!")
}
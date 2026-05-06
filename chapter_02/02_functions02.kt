package chapter_02

fun main() {
    val greeting = bdayGreeting()
    println(greeting)
}

fun bdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
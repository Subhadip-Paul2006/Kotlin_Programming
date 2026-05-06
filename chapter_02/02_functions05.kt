package chapter_02

fun main() {
    println(greeting("Rover", 5))
    println(greeting("Rex", 2))
}

fun greeting(name: String, age: Int): String { // VariableName : Parameter : ReturnType
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting" 
}

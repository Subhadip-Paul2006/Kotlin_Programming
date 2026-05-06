package chapter_01

fun main() {
    val name = "Kotlin"
    val message = """
    Hello, 
    this is a 
    multiline string.
    """.trimIndent()
    println("$name")
    println("$message")
}
// Float -> 32 bits -> (6 - 7) decimal digits
// Float -> 64 bits -> (15 - 18) decimal digits
// Byte -> 8 bits -> ( +- 127) integer values
// Short -> 16 bits -> ( +- 32767 ) integer values
// Int -> 32 bits -> ( +- 2^31) integer values
// Long -> 64 bits -> ( +- 2^63) integer values
//Char -> For Strings
//trimIndent -> to write multiline text without escaping
// Boolean -> True / False 
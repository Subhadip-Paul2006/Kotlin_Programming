package chapter_06

fun main() {
    // 1. We assign the lambda 'trick' to a new variable 'trickFunction'.
    // In Kotlin, functions are "first-class citizens," so you can store them like strings or ints.
    val trickFunction = trick

    // 2. Calling the original lambda directly.
    trick()

    // 3. Calling the lambda via the variable it was assigned to.
    // This performs the exact same action as trick().
    trickFunction()
}

/**
 * This is your 1st lambda expression!
 * - It has no parameters (so there is no '->').
 * - The variable 'trick' now holds the 'logic' of printing "No treats!".
 * - The type of this variable is actually () -> Unit (takes nothing, returns nothing).
 */
val trick = {
    println("No treats!")
}
package chapter_06

fun main() {
    // 1. Assigning the lambda 'trick' to a variable.
    // This doesn't run the code; it just points to the 'logic' stored in 'trick'.
    val trickFunction02 = trick02

    // 2. Executing the original lambda 'trick' using the invocation operator ().
    trick02()

    // 3. Executing the same logic via the new variable name.
    trickFunction02()

    // 4. Executing the 'treat02' lambda.
    // Notice it behaves exactly like 'trick' despite the more detailed definition below.
    treat02()
}

/**
 * Version 1: Type Inference
 * Kotlin is smart enough to see the { } and know this is a lambda of type () -> Unit.
 */
val trick02 = {
    println("No treats!")
}

/**
 * Version 2: Explicit Type Definition (Amy's 1st formal lambda)
 * ': () -> Unit' tells Kotlin: "This variable holds a function that
 * takes zero arguments () and returns nothing (Unit)."
 * This is the 'Long Form' way of writing lambdas.
 */
val treat02: () -> Unit = {
    println("Have a treat !")
}
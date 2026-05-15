package chapter_06

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    // FIX 1: Pass the second required argument (the lambda)
    val treatFunction03 = trickOrTreat03(false, coins)
    val trickFunction03 = trickOrTreat03(true, coins)

    treatFunction03()
    trickFunction03()
}

// This function returns a function! That's why the return type is () -> Unit
fun trickOrTreat03(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick03 // Make sure 'val trick03 = { ... }' exists outside this function
    } else {
        println(extraTreat(5)) // This uses the 'coins' or 'cupcake' lambda you passed in
        return treat // Make sure 'val treat = { ... }' exists outside this function
    }
}

// These must be defined for the function above to find them:
val trick03 = { println("No treats!") }
val treat = { println("Have a treat!") }
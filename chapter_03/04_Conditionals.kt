package chapter_03

fun main() {
    // 'Any' ka matlab hai ki 'x' mein kisi bhi type ka data (String, Int, etc.) aa sakta hai
    val x: Any = 20

    // 'when' check karta hai ki 'x' ki value kis category mein fit baithti hai
    when (x) {
        // Agar x ki value 2, 3, 5, ya 7 mein se koi ek hai
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")

        // 'in 1..10' check karta hai ki kya x, 1 se 10 ke beech mein hai (aur upar wali condition fail ho gayi hai)
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")

        // 'is Int' check karta hai ki kya x ek Integer (number) hai
        // Kyunki humne upar 1-10 check kar liya hai, toh yahan wahi numbers aayenge jo 10 se bade hain ya 1 se chhote
        is Int -> println("x is an integer number, but not between 1 and 10.")

        else -> println("x isn't an integer number.")
    }
}
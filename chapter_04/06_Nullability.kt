package chapter_04

fun main() {
    // 1. Ek Nullable variable banaya jo String ya null hold kar sakta hai
    var favoriteActor: String? = "Sandra Oh"

    // 2. Expression Style: 'if-else' ka result direct 'lengthOfName' mein jayega
    val lengthOfName = if (favoriteActor != null) {

        // Agar favoriteActor null NAHI hai, toh uski length nikal lo.
        // SMART CAST: Yahan Kotlin ko pata hai ki actor null nahi hai,
        // isliye humne bina '?.' ke direct '.length' use kiya hai.
        favoriteActor.length

    } else {

        // Agar favoriteActor null hai, toh default value '0' return karo
        0

    }

    // Final result print karna
    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

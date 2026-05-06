package chapter_04

fun main() {
    // 1. DECLARATION: Type ke peeche '?' lagaya hai.
    // Iska matlab 'favoriteActor' ab ek Nullable variable hai.
    // Yeh "Sandra Oh" (String) bhi rakh sakta hai aur 'null' bhi
    var favoriteActor: String? = "Sandra Oh"

    // Output: Sandra Oh
    println(favoriteActor)

    // 2. RE-ASSIGNMENT: Kyunki variable nullable (?) hai,
    // isliye hum ismein 'null' (no value) assign kar sakte hain
    favoriteActor = null

    // Output: null print hoga, app crash nahi hogi
    println(favoriteActor)
}

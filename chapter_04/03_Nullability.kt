package chapter_04

fun main() {
// 1. NON-NULLABLE: 'String' ke aage '?' nahi hai.
    // Iska matlab favoriteActor hamesha ek value hold karega, null kabhi nahi ho sakta.
    var favoriteActor1: String = "Sandra Oh"
    // .length direct use kar sakte hain kyunki variable null ho hi nahi sakta.
    println(favoriteActor1.length)


    // 2. NULLABLE with Value: Type 'String?' hai, yaani null allow hai.
    // Lekin abhi humne ismein "Sandra Oh" store kiya hai.
    var favoriteActor2: String? = "Sandra Oh"
    // Kyunki variable nullable hai, hume '?.' (Safe Call) use karna padega.
    // Yeh check karega: "Agar favoriteActor2 null nahi hai, toh hi length print karo."
    println(favoriteActor2?.length)


    // 3. NULLABLE with Null: Variable wahi hai, lekin value 'null' kar di gayi hai.
    var favoriteActor3: String? = null
    // Safe Call (?.) magic: Yeh check karega aur dekhega ki value null hai.
    // Program crash nahi hoga! Yeh bas 'null' print kar dega.
    println(favoriteActor3?.length)

}

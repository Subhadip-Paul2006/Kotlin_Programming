package chapter_04

fun main() {
    // 1. NULLABLE VARIABLE: '?' lagane se isme null aa sakta hai.
    var favoriteActor: String? = "Sandra Oh"

    // NOT-NULL ASSERTION (!!):
    // Aap compiler se keh rahe ho: "Main guarantee leta hoon ki ye null NAHI hai."
    // Kyunki abhi isme "Sandra Oh" hai, toh ye sahi se length (9) print kar dega.
    println(favoriteActor!!.length)

    // 2. AB VARIABLE MEIN NULL DALTE HAIN:
    favoriteActor = null

    // DANGER ZONE:
    // Yahan aap phir se '!!' use kar rahe ho, yaani aap bol rahe ho "Ye null nahi hai."
    // Lekin hakeekat mein ye 'null' hai.
    // RESULT: App CRASH ho jayegi! (NullPointerException aayega).
    println(favoriteActor!!.length)
}

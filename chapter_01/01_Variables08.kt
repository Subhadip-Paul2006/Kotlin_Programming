package chapter_01

fun main() {
    // --- 1. INTEGER TYPES ---
    val myByte: Byte = 100             // 8-bit
    val myShort: Short = 5000          // 16-bit
    val myInt: Int = 1_000_000         // 32-bit
    val myLong: Long = 9_000_000_000L  // 64-bit

    // --- 2. FLOATING POINT TYPES ---
    val myFloat: Float = 3.14f         // 32-bit
    val myDouble: Double = 3.14159     // 64-bit

    // --- 3. CHARACTER & BOOLEAN ---
    val myLetter: Char = 'K'           // Single character in single quotes
    val isLearning: Boolean = true     // Logical true/false

    // --- 4. STRINGS ---
    val greeting: String = "Hello Kotlin"

    // --- 5. CONVERSION EXAMPLES ---
    // Converting a Double to an Int (Truncation: .99 is lost)
    val price: Double = 19.99
    val integerPrice: Int = price.toInt()

    // Converting an Int to a Long (Widening: perfectly safe)
    val smallNum: Int = 50
    val bigNum: Long = smallNum.toLong()

    // --- PRINTING THE RESULTS ---
    println("--- Whole Numbers ---")
    println("Byte: $myByte\n Short: $myShort\n Int: $myInt\n Long: $myLong")

    println("\n--- Decimals ---")
    println("Float: $myFloat\n Double: $myDouble")

    println("\n--- Others ---")
    println("Char: $myLetter\n Boolean: $isLearning\n String: $greeting")

    println("\n--- Conversion Results ---")
    println("Double $price converted to Int is: $integerPrice")
    println("Int $smallNum converted to Long is: $bigNum")
}
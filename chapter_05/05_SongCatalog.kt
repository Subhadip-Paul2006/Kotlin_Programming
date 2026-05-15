package chapter_05

// Song catalog  description 
class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    // Property jeita dhake whether gaan ta populat or not ???
    val isPopular: Boolean
        get() = playCount >= 1000

    // Method jeita proper structure e print korte help korbe
    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val mySong = Song("Chenna Merea", "Arijit Singh", 2016, 1500000)
    mySong.printDescription()
    println("Is it popular? ${mySong.isPopular}")
}
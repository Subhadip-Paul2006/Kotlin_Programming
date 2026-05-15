package chapter_05

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        // Handle hobby printing
        if (hobby != null) {
            print("Likes to $hobby. ")
        }

        // Handle referrer logic
        if (referrer == null) {
            println("Doesn't have a referrer.")
        } else {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                println(", who likes to ${referrer.hobby}.")
            } else {
                println(".")
            }
        }
        println() // Adds a space between profiles
    }
}

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}
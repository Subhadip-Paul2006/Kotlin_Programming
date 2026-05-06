package chapter_03

fun main() {
    val trafficLightColor = "Amber"

    // 'message' variable ab pure 'when' block ka result store karega
    val message = when(trafficLightColor) {
        "Red" -> "Stop"

        //  Ek hi line mein multiple values (Yellow aur Amber) check ho rahi hain
        // Comma (,) ka matlab hai 'OR'. Agar light Yellow ho YA Amber, dono pe "Slow" milega.
        "Yellow", "Amber" -> "Slow"

        "Green" -> "Go"

        // 'else' yahan safety net hai, agar input in chaaro ke alawa kuch aur ho
        else -> "Invalid traffic-light color"
    }

    println(message)
}

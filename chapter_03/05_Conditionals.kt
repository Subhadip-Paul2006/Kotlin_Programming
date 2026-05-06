package chapter_03

fun main() {
    val trafficLightColor = "Black"

    // 'message' variable ki value 'if-else' logic ke result par depend karegi
    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"
    // stores the result of conditional inside the "message" bock

    println(message)
}

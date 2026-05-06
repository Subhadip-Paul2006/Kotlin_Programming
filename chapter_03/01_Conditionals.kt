package chapter_03

fun main() {
    val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    }
    else if (trafficLightColor == "Yellow") {
        println("Slow")
    }
    else if (trafficLightColor == "Green") {
        println("Go")
    }
    else // 'else' tab chalta hai jab upar ki koi bhi condition match nahi karti (Jaise default case)
    {
        println("Invalid traffic-light color")
    }

}

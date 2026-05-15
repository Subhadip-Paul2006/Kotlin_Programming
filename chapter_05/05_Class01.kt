package chapter_05

class SmartDevice02 {
    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice02()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

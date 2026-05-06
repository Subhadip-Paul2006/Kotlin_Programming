package chapter_05

// 1. PARENT CLASS: 'open' keyword zaroori hai taaki koi aur class ise inherit kar sake.
open class SmartDevice04(val name: String, val category: String) {
    var deviceStatus04 = "online"

    fun turnOn() {
        deviceStatus04 = "on"
        println("$name is turned on.")
    }

    fun turnOff() {
        deviceStatus04 = "off"
        println("$name is turned off.")
    }
}

// 2. CHILD CLASS (TV): SmartDevice04 ki saari properties iske paas aa jayengi.
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice04(name = deviceName, category = deviceCategory) {

    // SETTER: 'field' ka matlab hai actual variable. Hum check kar rahe hain 
    // ki volume 0-100 ke beech hi rahe.
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
}

// 3. CHILD CLASS (Light): Ye bhi SmartDevice04 se juda hua hai.
class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice04(name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}

fun main() {
    // TV ka object banaya
    val myTv = SmartTvDevice("Samsung OLED", "Entertainment")
    myTv.turnOn() // Parent class ka function call kiya
    myTv.increaseSpeakerVolume() // Apni class ka function call kiya

    println("---")

    // Light ka object banaya
    val myLight = SmartLightDevice("Philips Hue", "Home Decor")
    myLight.turnOn()
    myLight.increaseBrightness()
}
package chapter_05

// 1. PARENT CLASS: 'open' keyword se inheritance allow hoti hai.
open class smartDevice05(val name: String, val category: String) {
    var deviceStatus0505 = "online"

    // 'open' function ka matlab hai ki child classes ise 'override' kar sakti hain.
    open fun turnOn() {
        deviceStatus0505 = "on"
        println("$name is turned on.")
    }

    open fun turnOff() {
        deviceStatus0505 = "off"
        println("$name is turned off.")
    }
}

// 2. CHILD CLASS (TV):
class SmartTvDevice05(deviceName: String, deviceCategory: String) :
    smartDevice05(name = deviceName, category = deviceCategory) {

    var speakerVolume02 = 2
        set(value) {
            // 'field' keyword actual property value ko refer karta hai
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber02 = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    // OVERRIDING: TV ka turnOn thoda alag hai (ye volume bhi set karta hai)
    override fun turnOn() {
        super.turnOn() // 'super' parent class ke turnOn ko pehle chalayega
        println("$name volume is set to $speakerVolume02 and channel is $channelNumber02.")
    }

    fun increaseSpeakerVolume() {
        speakerVolume02++
        println("Speaker volume increased to $speakerVolume02.")
    }

    fun nextChannel() {
        channelNumber02++
        println("Channel number increased to $channelNumber02.")
    }
}

// 3. CHILD CLASS (Light):
class SmartLightDevice02(deviceName: String, deviceCategory: String) :
    smartDevice05(name = deviceName, category = deviceCategory) {

    var brightnessLevel02 = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    // OVERRIDING: Light on hote hi brightness dikhayega
    override fun turnOn() {
        super.turnOn()
        brightnessLevel02 = 10 // Default brightness on turning on
        println("$name brightness is set to $brightnessLevel02.")
    }

    fun increaseBrightness() {
        brightnessLevel02++
        println("Brightness increased to $brightnessLevel02.")
    }
}

fun main() {
    // TV Object
    val myTv = SmartTvDevice05("Samsung OLED", "Entertainment")
    myTv.turnOn() // Ye Overridden function chalayega
    myTv.increaseSpeakerVolume()
    myTv.nextChannel()

    println("---")

    // Light Object
    val myLight = SmartLightDevice02("Philips Hue", "Home Decor")
    myLight.turnOn()
    myLight.increaseBrightness()

    println("---")

    // Status Check
    myTv.turnOff()
    myLight.turnOff()
}
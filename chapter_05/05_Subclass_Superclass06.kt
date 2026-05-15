package chapter_05

// 1. PARENT CLASS
open class SmartDevice05(val name: String, val category: String) {

    // PROTECTED: Ise class ke bahar access nahi kar sakte, 
    // lekin iski bachhi (child) classes ise use kar sakti hain.
    protected var deviceStatus06 = "online"

    // PUBLIC (By Default): Ise kahin se bhi call kiya ja sakta hai.
    open fun turnOn() {
        deviceStatus06 = "on"
        println("$name is turned on.")
    }

    open fun turnOff() {
        deviceStatus06 = "off"
        println("$name is turned off.")
    }

    // PRIVATE: Ye function sirf isi class mein kaam karega.
    // Bahar kisi ko pata nahi chalega ki koi update hua hai.
    private fun logDeviceUpdate() {
        println("Internal log: Status changed to $deviceStatus06")
    }
}

// 2. CHILD CLASS (TV)
class SmartTvDevice06(deviceName: String, deviceCategory: String) :
    SmartDevice05(name = deviceName, category = deviceCategory) {

    // PRIVATE SET: Is variable ko bahar se read toh kar sakte hain, 
    // lekin direct change 'myTv.speakerVolume02 = 500' nahi kar sakte.
    var speakerVolume02 = 2
        private set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber06 = 1
        private set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        // 'deviceStatus06' yahan mil jayega kyunki wo 'protected' hai
        println("$name is now $deviceStatus06. Volume: $speakerVolume02")
    }

    fun increaseSpeakerVolume() {
        speakerVolume02++ // Class ke andar set allow hai kyunki setter private hai
        println("Speaker volume increased to $speakerVolume02.")
    }

    fun nextChannel() {
        channelNumber06++
        println("Channel number increased to $channelNumber06.")
    }
}

// 3. CHILD CLASS (Light)
class SmartLightDevice06(deviceName: String, deviceCategory: String) :
    SmartDevice05(name = deviceName, category = deviceCategory) {

    var brightnessLevel06 = 0
        private set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel06 = 10
        println("$name brightness is set to $brightnessLevel06.")
    }

    fun increaseBrightness() {
        brightnessLevel06++
        println("Brightness increased to $brightnessLevel06.")
    }
}

fun main() {
    val myTv = SmartTvDevice06("Samsung OLED", "Entertainment")

    // PUBLIC method call kar sakte hain
    myTv.turnOn()

    // ERROR: myTv.deviceStatus06 (Nahi dikhega kyunki protected hai)
    // ERROR: myTv.speakerVolume02 = 50 (Nahi chalega kyunki setter private hai)

    myTv.increaseSpeakerVolume() // Ye chalega kyunki function public hai

    println("---")

    val myLight = SmartLightDevice06("Philips Hue", "Home Decor")
    myLight.turnOn()
}
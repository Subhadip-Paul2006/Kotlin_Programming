package chapter_05

// 1. PARENT CLASS
// 'open' ka matlab inheritance allow hai.
// Visibility: 'public' (default) - Ise koi bhi dekh sakta hai.
open class brightnessLevel07(val name: String, val category: String) {

    // PROTECTED: Sirf ye class aur iske bachhe (Child classes) ise dekh sakte hain.
    // Main function mein 'myTv.deviceStatus' likhne par error aayega.
    protected var deviceStatus07 = "online"

    // INTERNAL: Ye poore project (module) mein kahin bhi dikhega.
    // Agar aapka app bada hai, toh sirf isi 'chapter_05' wale module mein ye function chalega.
    internal fun deviceType() = "Category: $category"

    // PUBLIC: Ye sabke liye khula hai.
    open fun turnOn() {
        deviceStatus07 = "on"
        logInternalAction("Powering ON") // Private function ko yahan call kiya
        println("$name is turned on.")
    }

    open fun turnOff() {
        deviceStatus07 = "off"
        println("$name is turned off.")
    }

    // PRIVATE: Ye is class ka "Secret" hai.
    // Ise na toh child class dekh sakti hai, na hi Main function.
    private fun logInternalAction(action: String) {
        println("[LOG]: $name is performing $action")
    }
}

// 2. CHILD CLASS (TV)
class SmartTvDevice07(deviceName: String, deviceCategory: String) :
    brightnessLevel07(name = deviceName, category = deviceCategory) {

    // PRIVATE SET: Log read kar sakte hain (Getter public hai),
    // lekin direct change nahi kar sakte (Setter private hai).
    var speakerVolume07 = 2
        private set(value) {
            if (value in 0..100) field = value
        }

    var channelNumber07 = 1
        private set(value) {
            if (value in 0..200) field = value
        }

    override fun turnOn() {
        // 'super' se parent ka public function call kiya
        super.turnOn()
        // 'deviceStatus07' yahan mil jayega kyunki ye child class hai (Protected power!)
        println("$name (Status: $deviceStatus07) volume: $speakerVolume07")
    }

    fun increaseSpeakerVolume() {
        speakerVolume07++ // Class ke andar set ho sakta hai
        println("Volume: $speakerVolume07")
    }
}

fun main() {
    val myTv = SmartTvDevice07("Samsung OLED", "Entertainment")

    // 1. PUBLIC access - OK
    myTv.turnOn()

    // 2. INTERNAL access - OK (agar same module hai)
    println(myTv.deviceType())

    // 3. PROTECTED access - ERROR!
    // println(myTv.deviceStatus07) // Ye line error degi kyunki Main child class nahi hai.

    // 4. PRIVATE access - ERROR!
    // myTv.logInternalAction("Test") // Ye line error degi kyunki ye sirf Parent ka secret hai.

    // 5. PRIVATE SETTER access - ERROR!
    // myTv.speakerVolume07 = 50 // Error! Sirf TV class ke functions volume badal sakte hain.
    myTv.increaseSpeakerVolume() // OK - Kyunki function public hai.
}
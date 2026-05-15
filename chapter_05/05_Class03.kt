package chapter_05

// 1. PRIMARY CONSTRUCTOR: Class ke header mein hi 'name' aur 'category' define kar di.
class SmartDevice03(val name: String, val category: String) {

    var deviceStatus = "online"

    // 2. SECONDARY CONSTRUCTOR: 
    // Agar humein 'statusCode' (Int) bhi pass karna ho, toh hum ise use karte hain.
    // ': this(name, category)' ka matlab hai ki ye pehle Primary Constructor ko call karega.
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {

        // StatusCode ke hisaab se status set karna
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun printDeviceInfo() {
        println("Device: $name, Category: $category, Status: $deviceStatus")
    }
}

fun main() {
    // Primary Constructor use karke object banana
    val tv = SmartDevice03("Android TV", "Entertainment")
    tv.printDeviceInfo()

    // Secondary Constructor use karke object banana (statusCode pass karke)
    val light = SmartDevice03("Smart Bulb", "Lighting", 0)
    light.printDeviceInfo()
}
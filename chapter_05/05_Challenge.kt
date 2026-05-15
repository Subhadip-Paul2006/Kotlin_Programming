package chapter_05

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// ---------------------------------------------------------
// 1. BASE CLASS: SmartDevice
// ---------------------------------------------------------
open class SmartDeviceFinal(val name: String, val category: String) {

    var deviceStatus = "off"
        protected set // Status sirf ye class aur iske bachhe change kar sakte hain

    open val deviceType = "unknown"

    // CHALLENGE: Print basic device info
    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

// ---------------------------------------------------------
// 2. CHILD CLASS: SmartTvDevice
// ---------------------------------------------------------
class SmartTvDeviceFinal(deviceName: String, deviceCategory: String) :
    SmartDeviceFinal(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulatorFinal(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulatorFinal(initialValue = 1, minValue = 0, maxValue = 200)

    // Volume and Channel Methods
    fun increaseSpeakerVolume() { speakerVolume++ }

    fun decreaseVolume() { // CHALLENGE: Volume kam karna
        speakerVolume--
        println("Volume decreased to $speakerVolume")
    }

    fun nextChannel() { channelNumber++ }

    fun previousChannel() { // CHALLENGE: Pichla channel
        channelNumber--
        println("Channel switched to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println("$name is ON. Volume: $speakerVolume, Channel: $channelNumber")
    }
}

// ---------------------------------------------------------
// 3. CHILD CLASS: SmartLightDevice
// ---------------------------------------------------------
class SmartLightDeviceFinal(deviceName: String, deviceCategory: String) :
    SmartDeviceFinal(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulatorFinal(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() { brightnessLevel++ }

    fun decreaseBrightness() { // CHALLENGE: Brightness kam karna
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 25
        println("$name is ON. Brightness: $brightnessLevel%")
    }
}

// ---------------------------------------------------------
// 4. SMART HOME: Controller Class
// ---------------------------------------------------------
class SmartHomeFinal(
    val smartTv: SmartTvDeviceFinal,
    val smartLight: SmartLightDeviceFinal
) {
    var deviceTurnOnCount = 0
        private set

    // Helper function: Kya device ON hai?
    private fun isDeviceOn(device: SmartDeviceFinal) = device.deviceStatus == "on"

    // TV Actions
    fun turnOnTv() {
        if (!isDeviceOn(smartTv)) {
            deviceTurnOnCount++
            smartTv.turnOn()
        }
    }

    fun decreaseTvVolume() {
        if (isDeviceOn(smartTv)) smartTv.decreaseVolume()
        else println("Action failed: TV is OFF")
    }

    fun changeTvChannelToPrevious() {
        if (isDeviceOn(smartTv)) smartTv.previousChannel()
    }

    fun printSmartTvInfo() = smartTv.printDeviceInfo()

    // Light Actions
    fun turnOnLight() {
        if (!isDeviceOn(smartLight)) {
            deviceTurnOnCount++
            smartLight.turnOn()
        }
    }

    fun decreaseLightBrightness() {
        if (isDeviceOn(smartLight)) smartLight.decreaseBrightness()
        else println("Action failed: Light is OFF")
    }

    fun printSmartLightInfo() = smartLight.printDeviceInfo()
}

// ---------------------------------------------------------
// 5. DELEGATE: RangeRegulator
// ---------------------------------------------------------
class RangeRegulatorFinal(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int = fieldData

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) fieldData = value
    }
}

// ---------------------------------------------------------
// 6. MAIN: Execution
// ---------------------------------------------------------
fun main() {
    val myTv = SmartTvDeviceFinal("LG WebOS", "Entertainment")
    val myLight = SmartLightDeviceFinal("Yeelight", "Living Room")
    val myHome = SmartHomeFinal(myTv, myLight)

    myHome.printSmartTvInfo()

    // Test: Bina ON kiye volume kam karne ki koshish
    myHome.decreaseTvVolume()

    // Step 1: Turn ON
    myHome.turnOnTv()

    // Step 2: Now perform actions
    myHome.decreaseTvVolume()
    myHome.changeTvChannelToPrevious()

    println("Active devices: ${myHome.deviceTurnOnCount}")
}
package chapter_05

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// 1. UNIQUE BASE CLASS NAME
open class SmartDeviceV2(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

// 2. UNIQUE TV CLASS NAME
class SmartTvDeviceV2(deviceName: String, deviceCategory: String) :
    SmartDeviceV2(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulatorV2(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulatorV2(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println("$name is turned on. Volume: $speakerVolume, Channel: $channelNumber.")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

// 3. UNIQUE LIGHT CLASS NAME
class SmartLightDeviceV2(deviceName: String, deviceCategory: String) :
    SmartDeviceV2(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulatorV2(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. Brightness: $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

// 4. UNIQUE SMART HOME CLASS NAME
class SmartHomeV2(
    val smartTvDevice: SmartTvDeviceV2,
    val smartLightDevice: SmartLightDeviceV2
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

// 5. UNIQUE DELEGATE CLASS NAME
class RangeRegulatorV2(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    // Variable name lowercase rakha (Standard practice)
    var myDevice: SmartDeviceV2 = SmartTvDeviceV2("Android TV", "Entertainment")
    myDevice.turnOn()

    myDevice = SmartLightDeviceV2("Google Light", "Utility")
    myDevice.turnOn()

    println("--- Smart Home V2 Testing ---")
    val home = SmartHomeV2(
        SmartTvDeviceV2("Sony", "TV"),
        SmartLightDeviceV2("Philips", "Light")
    )
    home.turnOnTv()
    home.turnOnLight()
    println("Total devices on: ${home.deviceTurnOnCount}")
}
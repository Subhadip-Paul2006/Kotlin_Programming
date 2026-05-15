package chapter_02

fun main() {
    // 1. Celsius to Fahrenheit: °F = 9/5 (°C) + 32
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") {
        (9.0 / 5.0) * it + 32
    }

    // 2. Kelvin to Celsius: °C = K - 273.15
    printFinalTemperature(350.0, "Kelvin", "Celsius") {
        it - 273.15
    }

    // 3. Fahrenheit to Kelvin: K = 5/9 (°F - 32) + 273.15
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") {
        (5.0 / 9.0) * (it - 32) + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
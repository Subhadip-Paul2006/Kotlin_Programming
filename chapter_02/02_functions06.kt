package chapter_02

fun main() {
    val firstUserOperatingSystem = "Windows"
    val firstUserEmailId = "MamataBanerjee@aitmc.com"

    println(displayAlertMessage(firstUserOperatingSystem, firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Mac OS"
    val secondUserEmailId = "RahulGandhi@ainc"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Linux"
    val thirdUserEmailId = "NarendraDamodarDasModi@bjp.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String, userEmailId: String): String {
    return "$operatingSystem, $userEmailId"
}
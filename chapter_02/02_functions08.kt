package chapter_02

fun main() {
    // Test Case 1: Today (300) > Yesterday (250) -> should be true
    println("Spent more time today than yesterday: ${compareTime(300, 250)}")

    // Test Case 2: Today (300) is NOT > Yesterday (300) -> should be false
    println("Spent more time today than yesterday: ${compareTime(300, 300)}")

    // Test Case 3: Today (200) is NOT > Yesterday (220) -> should be false
    println("Spent more time today than yesterday: ${compareTime(200, 220)}")
}

//fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
//    return timeSpentToday > timeSpentYesterday
//}
fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean = timeSpentToday > timeSpentYesterday
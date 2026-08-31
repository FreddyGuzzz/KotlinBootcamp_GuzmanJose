fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "black curry")

    val sortedCurries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(sortedCurries)

    val startCEndE1 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    println(startCEndE1)

    val startCEndE2 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(startCEndE2)

    val firstThreeC = spices.take(3).filter { it.startsWith('c') }
    println(firstThreeC)
}
fun main() {
    val resultadoPeces = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println("Cálculo de peces: $resultadoPeces")

    var rainbowColor = "red"
    rainbowColor = "blue"
    println("Color: $rainbowColor")

    val blackColor = "black"
    println("Color fijo: $blackColor")

    var greenColor: String? = null
    var blueColor: Int? = null
    println("Variables nulas declaradas correctamente.")

    listOf(null, null)
    var list: List<String?> = listOf(null, null)
    var list2: List<String?>? = null
    println("Listas creadas: $list")

    val nullTest: Int? = null
    println("NullTest con Elvis: " + (nullTest?.inc() ?: 0))
}
fun main() {
    println("1 pez + 1 pez = " + (1 + 1))
    println("30 peces - 25 comidos por tiburones = " + (30 - 25))

    println("División de enteros (1/2) = " + (1 / 2))
    println("División de decimales (1.0/2.0) = " + (1.0 / 2.0))

    val peces = 30
    var tiburones = 25
    tiburones = 4
    println("Tenemos $peces peces y $tiburones tiburones.")

    var premiosParaPeces: Int? = null
    println("Premios disponibles: " + (premiosParaPeces ?: 0))
}
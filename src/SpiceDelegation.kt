fun main() {
    val curry = Curry("Yellow Curry", "hot")
    println("Color del curry: ${curry.color}")
    curry.prepareSpice()
    curry.grind()

    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy"))
    )

    for (container in spiceCabinet) {
        println(container.label)
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        println("Preparando el curry...")
    }

    override fun grind() {
        println("Moliendo el curry...")
    }
}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}
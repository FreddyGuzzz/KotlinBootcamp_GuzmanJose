fun main(args: Array<String>) {
    for (i in 1..10) {
        val fortune = getFortuneCookie()
        println("\nTu fortuna es: $fortune")
        if (fortune.contains("calma")) break
    }
}

fun getFortuneCookie(): String {
    val list = listOf(
        "¡Tendrás un gran día!",
        "Hoy te irá bien.",
        "Que tengas un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer la moderación.",
        "¡Tómatelo con calma y disfruta de la vida!",
        "Valora a tus amigos porque son tu mayor fortuna."
    )
    print("Ingrese su fecha de nacimiento: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    val index = birthday.rem(list.size)
    return list[index]
}
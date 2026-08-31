fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nTu fortuna es: $fortune")
        if (fortune.contains("calma")) break
    }
}

fun getBirthday(): Int {
    print("\nIngrese su fecha de nacimiento: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday: Int): String {
    val list = listOf(
        "¡Tendrás un gran día!",
        "Hoy te irá bien.",
        "Que tengas un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer la moderación.",
        "¡Tómatelo con calma y disfruta de la vida!",
        "Valora a tus amigos porque son tu mayor fortuna."
    )

    return when (birthday) {
        28, 31 -> "Suerte extra hoy."
        in 1..7 -> "Disfruta de tu primera semana."
        else -> {
            val index = birthday.rem(list.size)
            list[index]
        }
    }
}
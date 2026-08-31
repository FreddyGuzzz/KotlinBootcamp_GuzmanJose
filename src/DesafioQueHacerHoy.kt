fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))

    print("¿Cómo te sientes? ")
    val moodInput = readLine()!!
    println(whatShouldIDoToday(moodInput))
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadRainyZero(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isVeryHot(temperature: Int) = temperature > 35

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappySunny(mood, weather) -> "salir a caminar"
        isSadRainyZero(mood, weather, temperature) -> "quedarse en la cama"
        isVeryHot(temperature) -> "ir a nadar"
        else -> "Quedarse en casa y leer."
    }
}
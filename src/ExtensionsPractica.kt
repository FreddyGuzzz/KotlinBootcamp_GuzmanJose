fun <T> List<T>.divisibleBy(block: (T) -> Int): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisibleBy {
        it.rem(3)
    })
}
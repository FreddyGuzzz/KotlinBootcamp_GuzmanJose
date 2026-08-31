fun main() {
    val numbers = intArrayOf(11, 12, 13, 14, 15)
    val stringList = mutableListOf<String>()
    for (number in numbers) {
        stringList.add(number.toString())
    }
    println(stringList)

    val list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) {
        list3.add(i)
    }
    println(list3)
}
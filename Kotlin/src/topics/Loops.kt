package topics

fun main() {
    // for each
    val items = listOf("apple", "banana", "orange") //list.of - array который нельзя изменить
    // mutableListOf("apple", "banana", "orange") //mutableListOf = ArrayList - array который можно изменить

    for (item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    // Диапозоны как в Python

    println(5 in 3..10) // true

    for (i in 1..10)
        println(i)

    for (i in 1 until 10)
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10)
        println(i)

}
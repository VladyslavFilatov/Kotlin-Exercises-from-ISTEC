package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("10 to 20")
        is String -> println("Was input String ${input.length}")
        else -> println("Bla bla bla")
    }
}
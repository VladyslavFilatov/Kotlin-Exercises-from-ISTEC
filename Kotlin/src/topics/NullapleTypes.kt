package topics

fun main() {
    var a: String = "Hello"
    // a = null // NPE исключены

    println(a.length)

    var b: String? = "Test"
    b = null

    // b.length

    // Вернет длину b, если null -> null ( Никаких NPE!)
    b?.length

    // Elvis оператор - ?:
    var  l = b?.length ?: -1 //если b не null получим в ответ длину, если null присваемаем переменной -1

    b = if ((0..10).random() > 5) "hey" else null
    // !! выбрасывает NPE в случае если в переменной null
    var  t = b!!.length
}
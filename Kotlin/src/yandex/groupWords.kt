package yandex

fun main() {
    // Sample Input ["eat", "tea", "tan", "ate", "nat", "bat"]
    // Sample Output [ [ "ate", "eat", "tea"], ["nat", "tan"], ["bat"] ]
    // Т.Е сгруппировать слова по общим буквам.

    println(groupWords(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))

}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        // ['a', 'b', 'c'].joinToString("-") -> 'a-b-c'
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord))
            map[sortedWord]?.add(word)
        else
            map[sortedWord] = mutableListOf(word)
    }

    for ((key, value) in map) {
        result.add(value)
    }

    return result
}
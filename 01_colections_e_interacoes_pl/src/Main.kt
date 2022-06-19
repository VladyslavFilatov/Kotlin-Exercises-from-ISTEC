fun main() {

    var hobbies = arrayOf("Programacao", "Estudar", "Correr", "Comer gelados")
    println(hobbies[3])
    println(hobbies.size)
    hobbies[2] = "Gaming"
    println(hobbies[2])

    for (hobbie in hobbies){
        println(hobbie)
    }

    println("---------------")
    hobbies.forEach {
        println(it)
    }

    println("---------------")
    hobbies.forEach { passatempo ->
        println(passatempo)
    }

    hobbies.forEachIndexed { index, passatempo ->
        println("$passatempo na posicao $index")
    }

    //Listas
    println("---------------")
    var livros = listOf("Design Potters", "Kotlin123", "Clean Code")
    livros.forEach {
        println(it)
    }

    println("---------------")
    //Map
    val contactos = mapOf("Ana" to 9112312, "Ze" to "abced", "Marta" to 234523, 1 to "istec")
    println(contactos["Ana"])
    contactos.forEach { k, v ->
        println("$k para $v")
    }

    println(contactos.keys)
    println(contactos.values)
    contactos.keys.forEach {
        println(it)
    }


    //List
    println("---------------")

    val babidas = mutableListOf("Cerveja", "Agua", "Suma")
    babidas.forEach {
        println(it)
    }

    babidas[1] = "xpto"
    babidas.add("teste")

    babidas.forEach{
        println(it)
    }

    println("---------------")

    val viagens = mutableMapOf("Dubai" to 2022)
    viagens.put("Polonia", 2023)

    viagens.forEach {
        println(it)
    }

    println("---------------")

    fun saudar(s: String, l: List<String> ){
        l.forEach{
            println("$s $it")
        }
    }
    saudar("Boa noite", listOf("Ana", "Ze", "Vlad"))

    println("---------------")
    fun criarListaTel(nomes:List<String>, nums:List<String>): Map<String,String>{
        var dict = mutableMapOf<String, String>()

        var i = 0
        while ( i < nomes.size) {
            dict.put(nomes[i],nums[i])
            //dict[nomes[i]] = nums[i]
            i++
        }
        return dict
    }

    println(criarListaTel(listOf("Jorge", "Joana"), listOf("91", "93")))


    // Lambda functions

    var imprimeVar : (String) -> Unit = { s -> println(s) }
    imprimeVar("xpto")

    var devolveVar : (String) -> String = { s -> "$s como return" }
    println(devolveVar("xpto"))

    var maiusculas : (String) -> String = { s -> s.toUpperCase() }
    println(maiusculas("go big"))

    val adicionar = { s:Int -> s+5 }
    println(adicionar(2))

}
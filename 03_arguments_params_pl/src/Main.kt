fun main() {

    fun ementaDoDia(hora:String, refeicoes:List<String>) {

        refeicoes.forEach { prato ->
            println("$hora : o prato disponivel é $prato")
        }
    }

    val listaDeRefeicoes = listOf("Peixe cozido", "Bolonhesa de marmelada", "Sopa")
    ementaDoDia("Pequeno almoço", listaDeRefeicoes)
    ementaDoDia("Lanche manha", listOf("teste"))


    println("---------------------------------------------")
    // Varargs

    fun ementaDoDia2(hora:String, vararg refeicoes:String) {
        refeicoes.forEach { prato ->
            println("$hora : disponivel(2) $prato")
        }
    }

    ementaDoDia2("almoco", "chocapic")
    ementaDoDia2("lanche", "fruta", "tostas mistas", "carne")
    //ementaDoDia2("jantae", listaDeRefeicoes) // da erro porque nao esta e espera de uma string
    var  arryDeDieta = arrayOf("Sopa", "Agua", "Sopa^2")
    //OPERADOR => spread operator *
    ementaDoDia2("ceia", *arryDeDieta)
    ementaDoDia2("jantae", *listaDeRefeicoes.toTypedArray()) // spread operator * работает только с array поэтому трансформируем lista to array


    println("---------------------------------------------")
    // Named arguments
    fun nomeDoAnimal(animal:String, nome:String) = println("0 $animal é conhecido por $nome.")

    nomeDoAnimal("Peixe", "Crazy Horse")
    nomeDoAnimal(animal = "Cao", nome = "Bisnau")
    nomeDoAnimal(nome = "Ao longe", animal = "Gato")


    println("---------------------------------------------")
    //Default params
    fun nomeDoAnimal2(animal:String = "Cobra", nome:String = "Python") = println("0 $animal é conhecido por $nome.")
    nomeDoAnimal2()
    nomeDoAnimal2("Pinhuim")
    nomeDoAnimal2(nome = "Nero")


    println("---------------------------------------------")
    //limitacoes
    ementaDoDia2("madrugada", *arryDeDieta)

    println("-".repeat(20))

    ementaDoDia2( hora = "ceia", *arryDeDieta)
    ementaDoDia2("peq alm", refeicoes = *arryDeDieta)
    ementaDoDia2(refeicoes = *arryDeDieta, hora = "jantar")

    

}
import javax.swing.text.StyledEditorKit.BoldAction

var saudacao = "Ola"

fun main() {

    println("Hello Kotlin")

    //1.Variaveis
    //Mutaveis
    var nome = "Antonio Manuel"
    nome = "Edgar Basto"
    println(nome)

    var sobrenome : String = "Filipe"

    //Imutaveis

    val apelido = "Sintra"
    //apelido = "Basto" // da erro
    println(apelido)

    //2.Scope
    //Global
    println(saudacao)

    //Local
    saudacao = "Oi"
    println(saudacao)

    fun  myFun() {
        //var saudacao = "Dentro da funcao: Bom dia."
        println("Dentro da funcao com variavel do scope superir:" + saudacao)
    }
    myFun()
    println("Fora da Funcao:" + saudacao)


    //Nullable
    //Default = nao nulos
    //var pessoa: String = null // Erro

    var pessoa: String? = null
    println(pessoa)

    //Inferencia automatica do tipo
    var y = 10 // y: Int
    println("y: " + y::class.simpleName)
    var x = 10.4// x: Double
    println("x: " + x::class.simpleName)

    //Control Flow
    //If
    if (pessoa != null) {
        println(saudacao)
    } else if (pessoa == "asd"){
        println("change it!")
    } else{
        println("pessoa vazio..")
    }

    //When
    when (pessoa) {
        "joao" -> println("o trabalho era opcional!")
        null -> println("aluno sem nome")
        else -> println(pessoa)
    }

    //atribuicao com control flow
    pessoa = "Joana"

    var aluno = if (pessoa != null) pessoa else "Nome por difinir."

    var aluno2 = when(pessoa) {
        null -> "Nome via when statement"
        else -> pessoa
    }
    println(aluno)
    println(aluno2)

    //Concatenacao de Strings
    println(saudacao + " " + aluno)

    //template expressions
    println("template exp: $saudacao $aluno")
    println("o $aluno tem ${aluno.length} caracteres.")

    //Basic type
    var inteiro: Int = 1
    var longo: Long = 123456789876543219 // Ate 19 numeros
    val  pi: Float = 3.1415f
    val e: Double = 2.123456789012
    val  texto: String = "um texto!"

    val umByte: Byte = 1

    val verdadeiro: Boolean = true
    val falso: Boolean = false

    println("teste bools:" + verdadeiro.toString())
    //println(inteiro + longo.toString()) // Erro estamos a tentar somar numero com string

    //outras conversoes
    //toByte()
    //toShort()
    //toInt()
    //toLong()
    //toDouble()
    //toChar()
}
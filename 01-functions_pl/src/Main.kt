fun main() {

    fun getSaudacao(): String {
        return "Ola ISTEC!"
    }

    println(getSaudacao())

    fun sayOla(): Unit {
        println(getSaudacao())
    }

    sayOla()

    fun getEmptySaudacao(): String? {
        return null
    }

    println(getEmptySaudacao())

    fun getSimpleSaudacao(): String = "Ola turma!"
    println(getSimpleSaudacao())

    fun getSimpleSaudacao2() = "Ola alunos!"
    println(getSimpleSaudacao2())

    fun sayBomDia(aluno: String): String{
        return "Bom dia $aluno"
    }
    println(sayBomDia("Ana"))

    fun imparNumBol(numero: Int): Boolean {
        return numero % 2 != 0
    }
    println(imparNumBol(1))

    fun numImpar2(x: Int) = x % 2 != 0
    println(numImpar2(7))

    fun helloWorld(hi: String, w: String): String {
        return hi + w
    }
    println(helloWorld("Hello ", "World"))

}
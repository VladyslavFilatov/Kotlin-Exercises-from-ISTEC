class Aluno

class Aluno2()

class Aluno3(_nome:String, _apelido:String) {
    var nome : String? = null
    var apelido : String? = null

    init {
        nome = _nome
        apelido = _apelido
        println("Classe Aluno3 inicializada!")
    }

    init {
        println("Print do init2")
    }
}

class Aluno4(var nome:String, var apelido:String)

class Aluno5(val nome:String, val apelido: String ){
    init {
        println("primeiro init")
    }

    constructor(): this("Sofia", "Nascimento") {
        println("print do construtor secundario")
    }

    init {
        println("segundo init")
    }

}

class Aluno5_multiple(val nome: String, val apelido: String) {

    constructor(_nome: String): this(_nome, "sem apelido") {
        println("construtor 1 param")
    }

    constructor(_apelido: String, x:Int): this("sem nome", _apelido)

    constructor(x: Int = 1, y:Int = 2): this("nums1", "nums2"){
        println("construtor dos inteiros")
    }

    constructor():this(".", "...") {
        println("construtor sem params")
    }

}

class Aluno6(val nome: String? = null, val apelido: String = "xpto")

class Aluno7(val nome: String = "maria", val apelido: String = "neves"){

    var alcunha: String? = null
    set(value) {
        field = value + "123"
        println("$value valor de alcunha mudou para $field")
    }
    get() {
        println("o valor de alcunha no getter e $field")
        return field + "omeumegareturn"
    }
}


// Metodos
class Aluno8(val nome: String = "maria", val apelido: String = "neves"){

    var alcunha: String? = null

    fun imprimeAlcunha() {

        var alcunhaParaImprimir = if (alcunha != null ) alcunha else "sem alcunha"

        var alcunhaParaImprimir2 = alcunha ?: "sem alcunha2"

        println("$nome $alcunhaParaImprimir2 $apelido $alcunhaParaImprimir $alcunha")
    }
}


// Visibilidade das classes

public  class Aluno9_pub(val nome:String = "temp")
internal class Aluno9_int(val nome: String = "temp")
private class Aluno9_pri(val nome: String = "temp")


// Visibilidade dos atributos
class Aluno9(val  nome: String = "temp") {

    protected  var alcunha :String? = "Tubarao"
    fun getMyAlcunha() : String? {
        return alcunha
    }

    private var idade :Int? = 30
    fun getMyIdade() : Int? {
        return idade
    }
}


// Heranca

open class Pessoa(var nome:String, var apelido:String = "sem apelido"){
    private var idade: Int? = null
    protected var alcunha: String? = null
}

class Professor(_nome: String): Pessoa(_nome)

class Medico(_nome: String): Pessoa(_nome) {
    var x: String? = super.alcunha

}





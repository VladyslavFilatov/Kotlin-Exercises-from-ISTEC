fun main() {
    val aluno = Aluno()
    val aluno2 = Aluno2()
    val aluno3 = Aluno3("jovem", "almeida")
    println(aluno3.nome)

    val aluno4 = Aluno4("edgar", "basto")
    println("${aluno4.nome} ${aluno4.apelido}")

    val aluno5 = Aluno5("ze", "dashortas")
    println("${aluno5.nome}")

    val aluno5_v2 = Aluno5()
    println("${aluno5_v2.nome}")

    println("-*".repeat(20))

    val aluno5_m_1 = Aluno5_multiple()
    println("${aluno5_m_1.nome}")
    val  aluno5_m_2 = Aluno5_multiple(1,2)
    println("${aluno5_m_2.nome}")

    val aluno6_1 = Aluno6("nomeqqq", "asadasa")
    val aluno6_2 = Aluno6(apelido = "xpto")
    val aluno6_3 = Aluno6("ze")
    val aluno6_4 = Aluno6()

    println("-*".repeat(20))

    val aluno7 = Aluno7("joana", "sintra")
    aluno7.alcunha = "xpto"
    println(aluno7.alcunha)


    println("-*".repeat(20))
    val aluno8 = Aluno8("xpto", "dosestudos")
    aluno8.alcunha = "tubarao"
    aluno8.imprimeAlcunha()


    println("-*".repeat(20))

    val aluno9_int = Aluno9_int()

    val  aluno9 = Aluno9()
    println(aluno9.getMyAlcunha())
    println(aluno9.getMyIdade())


    println("-*".repeat(20))
    val pessoa = Pessoa("Joao")
    pessoa.nome

    val professor = Professor("Edgar")
    professor.nome

    

}
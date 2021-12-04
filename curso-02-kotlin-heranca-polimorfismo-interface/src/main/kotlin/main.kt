fun main() {
    val funcionario1 = funcionario(
        nome = "Willian Fonseca",
        matricula = 2021,
        salario = 5000.00,
    )

    val gerente = gerente(
        nome = "Silvio Mendes Pedrosa",
        matricula = 2021,
        salario = 5000.00,
        senha = 123456
    )

    funcionario1.imprimeDados()

    gerente.imprimedados()

    if (gerente.autenticacao(123456)) {
        println("Login feito com SUCESSO!")
        println("========================================")
    }else{
        println("SENHA ERRADA!")
        println("========================================")
    }



    println("A bonificação do funcionario é: R$ ${funcionario1.bonificacao()}")
}



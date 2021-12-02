fun main() {
    testeCliente()
}

fun testeCliente() {
    // INSTANCIANDO AS CONTAS UTILIZANDO UM CONSTRUTOR
    val c1 = Conta("Willian Alves Fonseca", 1001)
    // Utilizar labels permite ter um codigo mais legivel
    val c2 = Conta(cliente = "Gabriela de Freitas", conta = 1002)
    // Utilizando a label não presisa enviar os parametros na ordem
    val c3 = Conta(conta = 1003, cliente = "Roberto Faria")

    // IMPRIMINDO CLIENTES
    println("Referência: $c1") // Numero de referencia na memoria
    c1.imprimeDados()
    println("Referência: $c2")
    c2.imprimeDados()
    println("Referência: $c3")
    c3.imprimeDados()

    // TESTE DEPOSITAR
    c1.depositar(100.00)
    c2.depositar(500.00)
    c3.depositar(1000.00)

    // TESTE TRANSFERENCIA
    c1.transferir(200.00, c2)
    c1.transferir(1000.00, c3)
}








fun testeCliente() {
    val c1 = Conta("Willian Alves Fonseca", 1001)
    val c2 = Conta(cliente = "Gabriela de Freitas", conta = 1002)
    val c3 = Conta(conta = 1003, cliente = "Roberto Faria")

    println("Referência: $c1")
    c1.imprimeDados()
    println("Referência: $c2")
    c2.imprimeDados()
    println("Referência: $c3")
    c3.imprimeDados()

    c1.depositar(100.00)
    c2.depositar(500.00)
    c3.depositar(1000.00)

    c1.transferir(200.00, c2)
    c1.transferir(1000.00, c3)
}
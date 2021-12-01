fun main() {
    val loops = loops()

    // INSTANCIANDO AS CONTAS
    val c1 = Conta()
    val c2 = Conta()
    val c3 = Conta()

    println("Referencia: $c1")
    c1.cliente = "Willian Alves Fonseca"
    c1.conta = 1001
    c1.saldo = 100.0
    c1.imprimeDados()

    println("Referencia: $c2")
    c2.cliente = "Gabriela de Freitas"
    c2.conta = 1002
    c2.saldo = 500.0
    c2.imprimeDados()

    println("Referencia: $c3")
    c3.cliente = "Roberto Faria"
    c3.conta = 1003
    c3.saldo = 1000.0
    c3.imprimeDados()

    //REFERÊNCIA NA MEMORIA
    println(c1)
    c1.depositar(100.00)
    c1.imprimeDados()


    println(c2)
    c2.depositar(500.00)
    c2.imprimeDados()


    println(c3)
    c3.depositar(1000.00)
    c3.imprimeDados()

    c1.depositar(100.00)
    c2.depositar(600.00)
    c3.depositar(1000.00)

    c1.transferir(200.00, c2)
    c1.transferir(1000.00, c3)

    c2.imprimeDados()

}








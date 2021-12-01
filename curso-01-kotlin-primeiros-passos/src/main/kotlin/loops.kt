class loops{
    fun imprimeResultado(cliente: String, conta: Int, saldo: Double) {
        println("Cliente: $cliente")
        println("Conta: $conta")
        println("Saldo: $saldo")
        println("=============================")
    }

    fun testeForNormal(cliente: String, conta: Int, saldo: Double) {
        for (i in 1..5) {
            // DA PARA ACRESCENTAR O DOWNTO
            // for (i in 1 until 5) Além do downTo, o Kotlin fornece o until, que exclui o último valor da iteração. Porém, ele funciona apenas para range crescente.

            println("Bem vindo ao banco BYTEBANK")

            val cliente = "Willian $i"
            val conta = 1000 + i
            val saldo = 200.0 * i

            imprimeResultado(cliente, conta, saldo)

        }
    }


    fun testeForDecrescente() {
        for (i in 5 downTo 1) {
            println("Bem vindo ao banco BYTEBANK")

            val cliente = "Willian $i"
            val conta = 1000 + i
            val saldo = 200.0 * i

            imprimeResultado(cliente, conta, saldo)
        }
    }

    fun testeForDownto() {
        for (i in 5 downTo 1) {
            println("Bem vindo ao banco BYTEBANK")

            val cliente = "Willian $i"
            val conta = 1000 + i
            val saldo = 200.0 * i

            imprimeResultado(cliente, conta, saldo)
        }
    }

    fun testeForDowntoStep() {
        for (i in 5 downTo 1 step 2) {
            println("Bem vindo ao banco BYTEBANK")

            val cliente = "Willian $i"
            val conta = 1000 + i
            val saldo = 200.0 * i

            imprimeResultado(cliente, conta, saldo)
        }
    }

    fun testacondicao(saldo: Double) {
        if (saldo > 0.0) {
            println("O saldo é positivo!")
        } else if (saldo == 0.0) {
            println("A conta esta zerada!")
        } else {
            println("O saldo é negativo!")
        }

        when {
            saldo > 0.0 -> println("O saldo é positivo!")
            saldo == 0.0 -> println("A conta esta zerada!")
            else -> println("O saldo é negativo!")
        }
    }

    fun testeWhile() {

        var i = 0

        while (i <= 5) {
            println("Bem vindo ao banco BYTEBANK")

            val cliente = "Willian $i"
            val conta = 1000 + i
            val saldo = 200.0 * i

            imprimeResultado(cliente, conta, saldo)

            i++
        }
    }

    fun doWhile() {

        var i = 0

        do {
            println("Bem vindo ao banco BYTEBANK")

            val cliente = "Willian $i"
            val conta = 1000 + i
            val saldo = 200.0 * i

            imprimeResultado(cliente, conta, saldo)

            i++
        } while (i <= 5)
    }

}
class Conta(
    var cliente: String,
    var conta: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        this.saldo += valor
        println("Foi depositado R$$valor na conta ${this.conta} do titular ${this.cliente}")
        println("=============================")
    }

    fun sacar(valor: Double) {
        if (saldo <= 0 || saldo < valor) {
            this.saldo -= valor
            println("Foram sacados R$valor da conta: ${this.conta} titular: ${this.cliente}")
            println("=============================")

        } else {
            println("Não ha saldo suficiente na conta ${this.conta}")
            println("=============================")
        }
    }

    fun imprimeDados() {
        println("Cliente: ${this.cliente}")
        println("Conta: ${this.conta}")
        println("Saldo: ${this.saldo}")
        println("=============================")
    }

    fun transferir(valor: Double, destino: Conta) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            println("O valor R$ $valor foi transferido da conta ${this.conta} para conta ${destino.conta}")
            println("=============================")
        } else {
            println("Não há saldo suficiente para realizar a trasferencia")
            println("=============================")
        }
    }
}
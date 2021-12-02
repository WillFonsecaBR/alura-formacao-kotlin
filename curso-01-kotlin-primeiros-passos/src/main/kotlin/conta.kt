// CONSTRUTOR PADRÃO
class Conta(
    var cliente: String,
    var conta: Int
) {
    // VAR PERMITE MODIFICAR
    // VAL NÃO PERMITE MODIFICAR

    // Quando instanciado no construtor padrão não precisa declarar
//    var cliente = ""
//    var conta = 0

    var saldo = 0.0
        private set // Deixa o atributo privado.

    // Não é necessario este tipo de implementação
    // Existe um construtor primario que ja vem implicito na classe;
//    constructor(cliente: String, conta: Int) {
//        this.cliente = cliente
//        this.conta = conta
//    }

    // Não é necessario este tipo de implementação
//    fun getSaldo(): Double {
//        return this.saldo
//    }
//    fun setSaldo(valor: Double) {
//        this.saldo = valor
//    }

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
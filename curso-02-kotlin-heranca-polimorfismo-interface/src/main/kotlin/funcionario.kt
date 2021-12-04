import java.awt.desktop.PrintFilesEvent

class funcionario(
    val nome: String,
    val matricula: Int,
    var salario: Double
    ) {
    fun bonificacao(): Double {
        return this.salario * 0.1
    }
    fun imprimeDados() {
        println("Nome: ${this.nome}")
        println("Matrícula: ${this.matricula}")
        println("Salario: ${this.salario}")
        println("========================================")
    }
}
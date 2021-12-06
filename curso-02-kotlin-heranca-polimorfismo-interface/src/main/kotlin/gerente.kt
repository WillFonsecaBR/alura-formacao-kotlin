import jdk.dynalink.beans.StaticClass

class gerente(
    val nome: String,
    val matricula: Int,
    var salario: Double,
    private
    val senha: Int
) {
    fun autenticacao(senha: Int): Boolean {
        when {
            senha == this.senha -> {
                return true
            }
            else -> {
                return false
            }
        }
    }

    fun beneficio(): Double {
        return this.salario * 0.5
    }

    fun imprimedados() {
        println("Nome: ${this.nome}")
        println("Matrícula: ${this.matricula}")
        println("Salario: ${this.salario}")
        println("========================================")
    }
}
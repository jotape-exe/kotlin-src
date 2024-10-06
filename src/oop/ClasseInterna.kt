package oop

class Escola(val nome: String) {
    inner class Estudante(val nomeEstudante: String) {
        fun exibirInfo() {
            println("Escola: $nome")
            println("Estudante: $nomeEstudante")
        }
    }
}

fun main() {
    val escola = Escola("Escola Municipal")
    val estudante = escola.Estudante("João")
    estudante.exibirInfo()
}

package avancado.delegate

class Usuario {
    val nome: String by lazy {
        println("Inicializando o nome...")
        "Maria Silva"
    }
}

fun main() {
    val usuario = Usuario()
    println("Usuário criado.")
    println("Nome do usuário: ${usuario.nome}") // Inicializa o nome
    println("Acessando novamente o nome: ${usuario.nome}") // Não inicializa novamente
}

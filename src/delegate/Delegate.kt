package delegate

data class AlunoRequest(
    val nome: String,
    val idade: Int,
    val email: String
)

data class Aluno(
    val id: Int,
    val nome: String,
    val idade: Int,
    val email: String
)

class AlunoDelegate {
    private var idCounter = 1 // Simulando um contador de IDs

    operator fun invoke(alunoRequest: AlunoRequest): Aluno {
        return Aluno(
            id = idCounter++,
            nome = alunoRequest.nome,
            idade = alunoRequest.idade,
            email = alunoRequest.email
        )
    }
}

fun main() {
    val alunoRequest = AlunoRequest(
        nome = "Maria Oliveira",
        idade = 20,
        email = "maria.oliveira@example.com"
    )

    // Usando o delegate para converter AlunoRequest em Aluno
    val alunoDelegate = AlunoDelegate()
    val aluno = alunoDelegate(alunoRequest)

    println("Aluno: ${aluno.id}," +
            " Nome: ${aluno.nome}," +
            " Idade: ${aluno.idade}," +
            " Email: ${aluno.email}"
    )
}

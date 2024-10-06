package funcoes

class Pessoa {
    var nome: String = "João"
        get() = field.uppercase()
        set(value) {
            field = if (value.isNotBlank()) value else "Desconhecido"
        }

    var idade: Int = 18
        // redundante
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Idade não pode ser negativa.")
            }
        }
}


fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    pessoa.nome = "Maria"
    println(pessoa.nome)

    pessoa.nome = ""
    println(pessoa.nome)

    pessoa.idade = 25
    println(pessoa.idade)

    pessoa.idade = -5
    println(pessoa.idade)
}

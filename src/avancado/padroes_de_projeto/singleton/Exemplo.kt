package avancado.padroes_de_projeto.singleton

fun main() {
    // Usando a instância "singleton"
    val conexao1 = MeuSingletonDB.getInstance()
    println(conexao1.executeSQL("SELECT * FROM usuarios"))

    val conexao2 = MeuSingletonDB.getInstance()

    // Criando uma nova instânci
    val conexao3 = MeuSingletonDB.newInstace()
    println(conexao3.executeSQL("SELECT * FROM produtos"))

    // Verificando se as instâncias são diferentes
    println("Conexão1 e Conexão2 são iguais? ${conexao1 == conexao2}")
    println("Conexão1 e Conexão3 são iguais? ${conexao1 == conexao3}")
}
package avancado.padroes_de_projeto.singleton

class MeuSingletonDB private constructor() {

    init {
        println("Conexão com o banco de dados estabelecida.")
    }

    fun executeSQL(sql: String): String {
        return "Executando: $sql"
    }

    companion object {

        @Volatile
        private var instancia: MeuSingletonDB? = null

        fun getInstance(): MeuSingletonDB {
            // Implementando Double-Checked Locking para garantir que seja thread-safe
            return instancia ?: synchronized(this) {
                instancia ?: MeuSingletonDB().also { instancia = it }
            }
        }

        fun newInstace(): MeuSingletonDB {
            return MeuSingletonDB()
        }

        fun clearInstance() {
            instancia = null
        }

    }
}
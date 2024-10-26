package avancado.padroes_de_projeto.strategy

interface ModoPreparoCafe {
    fun preparar(): String
}

class Expresso : ModoPreparoCafe {
    override fun preparar() = "Preparando um café expresso forte e encorpado."
}

class Cappuccino : ModoPreparoCafe {
    override fun preparar() = "Preparando um cappuccino com leite vaporizado e espuma cremosa."
}

class Latte : ModoPreparoCafe {
    override fun preparar() = "Preparando um latte suave com bastante leite vaporizado."
}

// Máquina de café que usa uma estratégia de preparo
class MaquinaDeCafe(private var modoPreparo: ModoPreparoCafe) {
    fun fazerCafe() = modoPreparo.preparar()

    fun alterarModoPreparo(novoModoPreparo: ModoPreparoCafe) {
        modoPreparo = novoModoPreparo
    }
}

// Exemplo de uso
fun main() {

    val maquina = MaquinaDeCafe(Expresso())
    println(maquina.fazerCafe())
    // Output: Preparando um café expresso forte e encorpado.

    maquina.alterarModoPreparo(Cappuccino())
    println(maquina.fazerCafe())
    // Output: Preparando um cappuccino com leite vaporizado e espuma cremosa.

    maquina.alterarModoPreparo(Latte())
    println(maquina.fazerCafe())
    // Output: Preparando um latte suave com bastante leite vaporizado.
}

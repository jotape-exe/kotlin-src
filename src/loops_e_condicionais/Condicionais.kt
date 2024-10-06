package loops_e_condicionais

import kotlin.random.Random

// Usando condicionais em kotlin

fun main() {

    val nome = "John Doe"

    // If Tradicional
    if (nome.length < 5)
        println("Nome curto")
    else if (nome.length > 5 && nome.length < 14)
        println("Nome Medio")
    else
        println("Nome longo")


    // If como expressão
    val TamanhoDoNome = if(nome.length < 4) "Nome Curto" else "Nome Médio"

    println("If Como expressa: $TamanhoDoNome")


    // When - 'Switch case' usado como expressão ..
    val numericValue = when (Random.nextInt(0,2)) {
        0 -> "Bit Zero"
        1 -> "Bit Um"
        else -> { "Nunca acontece" }
    }

    println(numericValue)
}

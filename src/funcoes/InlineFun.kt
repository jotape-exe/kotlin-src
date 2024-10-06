package funcoes

inline fun fazOperacaoMatematica(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

fun main() {
    val resultado = fazOperacaoMatematica(4, 5) { x, y -> x + y }
    println(resultado) // Esperado: 9

    val resultado2 = fazOperacaoMatematica(4, 5) { x, y -> x - y }
    println(resultado2) // Esperado: -1
}

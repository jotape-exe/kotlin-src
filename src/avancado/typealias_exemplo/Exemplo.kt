package avancado.typealias_exemplo

typealias Operacao = (Int, Int) -> Int

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun subtrair(a: Int, b: Int): Int {
    return a - b
}

fun calcular(a: Int, b: Int, operacao: Operacao): Int {
    return operacao(a, b)
}

fun main() {
    val resultadoSoma = calcular(5, 3, ::somar)
    val resultadoSubtracao = calcular(5, 3, ::subtrair)

    println("Resultado da soma: $resultadoSoma") // 8
    println("Resultado da subtração: $resultadoSubtracao") // 2
}

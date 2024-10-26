package recursao

import kotlin.system.measureTimeMillis

fun fibonacciRecursivo(n: Int): Int {
    return if (n <= 1) n else fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2)
}

tailrec fun fibonacciTailRec(n: Int, a: Int = 0, b: Int = 1): Int {
    return if (n == 0) a else fibonacciTailRec(n - 1, b, a + b)
}

fun main() {

    val n = 46

    // Medindo o tempo de execução para a função recursiva normal
    val tempoRecursivo = measureTimeMillis {
        val resultadoRecursivo = fibonacciRecursivo(n)
        println("Resultado Fibonacci Recursivo para $n: $resultadoRecursivo")
    }
    println("Tempo de execução (recursivo): $tempoRecursivo ms")

    // Medindo o tempo de execução para a função tailrec
    val tempoTailRec = measureTimeMillis {
        val resultadoTailRec = fibonacciTailRec(n)
        println("Resultado Fibonacci TailRec para $n: $resultadoTailRec")
    }
    println("Tempo de execução (tailrec): $tempoTailRec ms")
}

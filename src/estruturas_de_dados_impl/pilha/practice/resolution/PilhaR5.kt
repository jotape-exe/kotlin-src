package estruturas_de_dados_impl.pilha.practice.resolution

import estruturas_de_dados_impl.pilha.Pilha

fun torresDeHanoi(n: Int, origem: Pilha<Int>, destino: Pilha<Int>, auxiliar: Pilha<Int>) {
    if (n == 1) {
        origem.desempilhar()?.let { destino.empilhar(it) }
        return
    }
    torresDeHanoi(n - 1, origem, auxiliar, destino)
    origem.desempilhar()?.let { destino.empilhar(it) }
    torresDeHanoi(n - 1, auxiliar, destino, origem)
}

fun main() {
    val numDiscos = 4
    val torreA = Pilha<Int>()
    val torreB = Pilha<Int>()
    val torreC = Pilha<Int>()

    for (i in numDiscos downTo 1) {
        torreA.empilhar(i)
    }

    println("Antes da resolução:")
    println("Torre A: $torreA")
    println("Torre B: $torreB")
    println("Torre C: $torreC")

    torresDeHanoi(numDiscos, torreA, torreC, torreB)

    println("\nDepois da resolução:")
    println("Torre A: $torreA")
    println("Torre B: $torreB")
    println("Torre C: $torreC")
}
package estruturas_de_dados_impl.pilha.practice.resolution

import estruturas_de_dados_impl.pilha.Pilha

const val DECIMAL_EXAMPLE = 56
fun main(){

    var decimal = DECIMAL_EXAMPLE

    val pilha = Pilha<Int>()
    val bin = StringBuilder()

    while (decimal > 0){
        pilha.empilhar(decimal % 2)
        decimal /= 2
    }

    for (i in 0..<pilha.length()){
        bin.append(pilha.desempilhar())
    }

    println("Decimal($DECIMAL_EXAMPLE) para Binario -> ($bin)")
}
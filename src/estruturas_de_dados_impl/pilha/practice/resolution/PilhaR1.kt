package estruturas_de_dados_impl.pilha.practice.resolution

import estruturas_de_dados_impl.pilha.Pilha

fun main(){
    var pilha = Pilha<String>(capacidade = 10)
    val pilhaInvertida = Pilha<String>(capacidade = 10)

    for (i in 0..27 step 3){
        pilha.empilhar("Elemento ${i}")
    }

    while (pilha.naoEstaVazio()){
        pilha.desempilhar()?.let {
            pilhaInvertida.empilhar(it)
        }
    }

    pilha = pilhaInvertida

    println(pilha)

    println(pilha.topo())
}
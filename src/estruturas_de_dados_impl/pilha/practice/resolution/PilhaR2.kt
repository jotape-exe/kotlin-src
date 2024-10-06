package estruturas_de_dados_impl.pilha.practice.resolution

import estruturas_de_dados_impl.pilha.Pilha

fun main(){
    val options = listOf('(', ')')
    val pilha = Pilha<Char>(20)
    val tempPilha = Pilha<Char>(20)

    while (pilha.length() < 100){
        pilha.empilhar(options.random())
    }

    while (pilha.naoEstaVazio()){
        val element = pilha.desempilhar()

        element?.let {
            if(tempPilha.topo() != element){
                tempPilha.empilhar(it)
            }
        }
    }

    val str = StringBuilder()

    for (i in 0..< tempPilha.length()){
        str.append("${tempPilha.desempilhar()} ")
    }

    println(str)
}
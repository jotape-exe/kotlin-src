package estruturas_de_dados_impl.pilha.practice.resolution

import estruturas_de_dados_impl.pilha.Pilha

fun main(){
    val palindromo = "AABBCCASSACCBBAA"
    val palindromo2 = "ANA"
    val naoPalindromo = "AADDSA"

    var ehPalindromo = StringBuilder()
    val pilha = Pilha<Char>()


    for (element in palindromo){
        pilha.empilhar(element)
    }

    while (pilha.naoEstaVazio()){
        pilha.desempilhar()?.let {
            ehPalindromo.append(it)
        }
    }

    val result = ehPalindromo.toString() == palindromo

    println(result)
}
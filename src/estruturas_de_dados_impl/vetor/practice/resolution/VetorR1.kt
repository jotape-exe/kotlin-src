package estruturas_de_dados_impl.vetor.practice.resolution

import estruturas_de_dados_impl.vetor.Vetor

fun main(){
    val  vetor = Vetor<String>()

    for (i in 0..20){
        vetor.add("Elemento $i")
    }

    println("Primeiro a entrar: ${vetor[0]}")

    println("Ultimo a entrar: ${vetor[vetor.length()-1]}")

    println(vetor)
}
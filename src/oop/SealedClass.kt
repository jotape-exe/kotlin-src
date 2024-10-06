package oop

sealed class Mamifero(val nome:String)

class Cachorro(val nomeCahorro:String): Mamifero(nomeCahorro)
class Humano(val nomeHumano:String): Mamifero(nomeHumano)

fun printMamifero(mamifero: Mamifero){
    println(mamifero.nome)
}

fun main() {
    val cachorro = Cachorro("Zeux")
    printMamifero(cachorro)
}
# Praticando a implementação de Pilhas(`Stack<*>`)


## 1. Inverta a ordem da seguinte pilha:
```kotlin
fun main(){
    val pilha = Pilha<String>(capacidade = 10)

    for (i in 0..27 step 3){
        pilha.empilhar("Elemento ${i}")
    }
}


//Implemente o código
//...


//Saída esperada:
//Pilha[{valor=Elemento 27},{valor=Elemento 24},{valor=Elemento 21},{valor=Elemento 18},{valor=Elemento 15},{valor=Elemento 12},{valor=Elemento 9},{valor=Elemento 6},{valor=Elemento 3},{valor=Elemento 0},]

```
## 2. Verificar se uma sequência de parênteses está balanceada
Escreva uma função que receba uma sequência de parênteses como uma string e determine se os parênteses estão balanceados.
````kotlin
fun main() {
    val options = listOf('(', ')')
    val pilha = Pilha<Char>(20)
    val tempPilha = Pilha<Char>(20)

    while (pilha.length() < 100) {
        pilha.empilhar(options.random())
    }
    
    //Implemente o código abaixo
    //...
    
    
    
    //Saída esperada(Não sera 100% preciso pois o valores são randomicos):
    //Sequancia: () () () () ()
}
````

## 3. Testador de palíndromos. Escreva um programa que use uma pilha para determinar se uma string é um palíndromo (ou seja, se ela é escrita de forma idêntica de trás para a frente e de frente para trás).
- Ex: __AABBAA__, __ASDDFFDDSA__, __OOPPIIPPOO__

````kotlin
fun main() {
    //Teste usando diferentes strings
    val palindromo = "AABBCCASSACCBBAA"
    val palindromo2 = "ANA"
    val naoPalindromo = "AADDSA"

    var ehPalindromo = StringBuilder()
    val pilha = Pilha<Char>()


    for (element in palindromo) {
        pilha.empilhar(element)
    }
    
    //Implemente o código abaixo
    //..
    
}
````

## 4. Utilizando pilhas desenvolva um algoritmo de converta números decimais para binários
````kotlin
//constante apenas para exibicao no console
const val DECIMAL_EXAMPLE = 56
fun main(){

    var decimal = DECIMAL_EXAMPLE

    val pilha = Pilha<Int>()
    val bin = StringBuilder()


    //Implemente o código abaixo
    //...
    
    
    
    //...

    println("Decimal($DECIMAL_EXAMPLE) para Binario -> ($bin)")
}
````
## 5. Como você implementaria um algoritmo em Kotlin para resolver o problema da Torre de Hanoi usando pilhas, garantindo que apenas os movimentos válidos sejam realizados e que cada disco seja movido para a torre correta de acordo com as regras do jogo?

```kotlin

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

    //Sua implementação
    //...

    println("\nDepois da resolução:")
    println("Torre A: $torreA")
    println("Torre B: $torreB")
    println("Torre C: $torreC")
}

//...
//Saída esperada

/*
Antes da resolução:
Torre A: Pilha[{valor=4},{valor=3},{valor=2},{valor=1},]
Torre B: Pilha[]
Torre C: Pilha[]

Depois da resolução:
Torre A: Pilha[]
Torre B: Pilha[]
Torre C: Pilha[{valor=4},{valor=3},{valor=2},{valor=1},]
*/
```
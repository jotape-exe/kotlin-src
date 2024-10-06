package loops_e_condicionais


val frutas = arrayOf("Manga","Maracuja", "Melancia","Banana", "Macã", "Uva", "Morango")

fun main() {
    for (fruta in frutas) println(fruta)

    // Va de X até Y. Acrescendo
    for (i in 0..33) {
        println(i)
    }

    // Va de X até Y. Decrescendo
    for (i in 33 downTo 0 step 2) {
        println(i)
    }

    // Va de X até Y. Decrescendo, Pulando de 2 em 2
    for (i in 33 downTo 0 step 2) {
        println(i)
    }

    // For com indices
    for ((index, fruta) in frutas.withIndex()) {
        println("Fruta #$index é $fruta")
    }

    //Break e continue
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 20) {
                println("Parou o loop -> Break")
                break@loop
            }
        }
    }

    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // Retorna o 'it' da lambda
        print(it)
    }

    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // Inrterrompe a lamda
        print(it)
    }

    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // Forma anonima
        print(value)
    })



}
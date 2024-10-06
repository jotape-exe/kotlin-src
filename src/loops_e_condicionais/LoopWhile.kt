package loops_e_condicionais

fun fazAlgumaCoisa(): String {
    return "Alguma coisa"
}

fun main() {
    var x = 10

  // While tradicional
    while (x > 0) {
        println(x)
        x--
    }

    // Do while :)
    do {
        val y = fazAlgumaCoisa()
        println(y)
    } while (y == null)
}
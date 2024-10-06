package delegate

import kotlin.properties.Delegates

class Estudante {
    var nota: Int by Delegates.observable(0) { _, oldValue, newValue ->
        println("Nota alterada de $oldValue para $newValue")
    }
}

fun main() {
    val estudante = Estudante()
    estudante.nota = 85 // Notifica sobre a mudança
    estudante.nota = 90 // Notifica sobre a mudança
}

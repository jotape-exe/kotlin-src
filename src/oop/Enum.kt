package oop

enum class Dificuldade{
    BASICO, INTERMEDIARIO, AVANCADO
}

fun main() {
    val nivelCurso = Dificuldade.AVANCADO

    val message = when(nivelCurso){
        Dificuldade.BASICO -> "Nivel basico. Para iniciantes"
        Dificuldade.INTERMEDIARIO -> "Nivel intermediario. Para amadores"
        Dificuldade.AVANCADO -> "Nivel avancado. Para experientes"
    }

    println(message)
}
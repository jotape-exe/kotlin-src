package annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Curso(val nome: String)

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Professor(val nome: String, val disciplina: String)

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Aluno(val nome: String, val idade: Int)

@Curso(nome = "Matemática")
class CursoMatematica {
    // Implementação do curso de Matemática
}

@Professor(nome = "João Silva", disciplina = "Matemática")
class ProfessorMatematica {
    // Implementação do professor de Matemática
}

@Aluno(nome = "Maria Oliveira", idade = 16)
class AlunoMatematica {
    // Implementação do aluno de Matemática
}

/*
* Uso de kotlin reflections
* ver mais em: https://kotlinlang.org/docs/reflection.html#class-references
* */
fun main() {
    // Obtendo informações sobre o curso

    val curso = CursoMatematica::class.annotations.find { it is Curso } as? Curso
    println("Curso: ${curso?.nome}")

    // Obtendo informações sobre o professor
    val professor = ProfessorMatematica::class.annotations.find { it is Professor } as? Professor
    println("Professor: ${professor?.nome}, Disciplina: ${professor?.disciplina}")

    // Obtendo informações sobre o aluno
    val aluno = AlunoMatematica::class.annotations.find { it is Aluno } as? Aluno
    println("Aluno: ${aluno?.nome}, Idade: ${aluno?.idade}")
}

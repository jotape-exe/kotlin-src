package estruturas_de_dados_impl.fila

fun main(){
    val fila = Fila<Int>()
    val filaPrioridade = FilaComPrioridade<Paciente>()

    for (i in 0..10){
        fila.add(i)
    }

    println(fila)

    fila.pool()
    fila.pool()
    fila.pool()

    println(fila.peek())

    println("Algumas remoções ...")

    println(fila)

    println("Fila com priori")


    filaPrioridade.add(Paciente(34))
    filaPrioridade.add(Paciente(24))
    filaPrioridade.add(Paciente(64))
    filaPrioridade.add(Paciente(64))
    filaPrioridade.add(Paciente(14))

    println(filaPrioridade.peek())

    println(filaPrioridade)


}

data class Paciente(val idade: Int): Comparable<Paciente> {
    override fun compareTo(other: Paciente): Int {
        if (idade > other.idade){
            return 1
        } else if(idade == other.idade){
            return  0
        }
        return  -1
    }
}
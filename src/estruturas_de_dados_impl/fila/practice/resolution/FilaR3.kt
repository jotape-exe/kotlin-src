package estruturas_de_dados.fila.practice.resolution

import estruturas_de_dados_impl.fila.Fila
import estruturas_de_dados_impl.fila.FilaComPrioridade
import kotlin.random.Random

val fila = FilaComPrioridade<Paciente>()

val logAtendimento = Fila<Paciente>()

fun main() {
    iniciarFilaPacientes()
    iniciarAtendimento()
}

private fun gerarPessoaAleatoria(): Paciente {
    return getPrioridadeRandom().let { prioridade -> Paciente("Paciente Aleatorio (${prioridade})", prioridade) }
}

private fun getPrioridadeRandom(): PrioridadeAtendimento {
    val prioridadeRandom = Random.nextInt(0, 3)

    val PrioridadeAtendimentoMap = mapOf(
            PrioridadeAtendimento.VERDE.ordinal to PrioridadeAtendimento.VERDE,
            PrioridadeAtendimento.AMARELO.ordinal to PrioridadeAtendimento.AMARELO,
            PrioridadeAtendimento.VERMELHO.ordinal to PrioridadeAtendimento.VERMELHO
    )

    return PrioridadeAtendimentoMap[prioridadeRandom]!!
}

private fun iniciarFilaPacientes() {
    for (i in 0..<6) {
        val prioridade = getPrioridadeRandom()
        fila.add(Paciente("Paciente $i", prioridade))
    }
}


private fun iniciarAtendimento() {
    println(fila)

    var contadorPacientes = 0

    do {
        fila.pool()?.let { atendido->
            contadorPacientes++

            println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
            println("(Nº$contadorPacientes) Atendido: $atendido")
            println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

            logAtendimento.add(atendido)
        }

        atenderNovaPessoa()

        if (contadorPacientes == 10){
            println("Fim do expediente")
            println("=-=-= LOG =-=-=")
            println(logAtendimento)
            break
        }


    } while (true)
}

fun atenderNovaPessoa(){
    println("Atendendo...")
    Thread.sleep(4000)
    val novaPessoa = gerarPessoaAleatoria()
    fila.add(novaPessoa)
    Thread.sleep(1000)

}
data class Paciente(val nome: String, val pulseira: PrioridadeAtendimento): Comparable<Paciente> {
    override fun compareTo(outroPaciente: Paciente): Int {
        if (outroPaciente.pulseira > this.pulseira){
            return  1
        } else if(outroPaciente.pulseira == this.pulseira){
            return  0
        }

        return  -1
    }
}

enum class PrioridadeAtendimento(value: Int) {
    VERDE(value = 2),
    AMARELO(value = 1),
    VERMELHO(value = 0)
}
package estruturas_de_dados_impl.fila.practice.resolution

import estruturas_de_dados_impl.fila.Fila
import kotlin.random.Random


val filaComPrioridade = Fila<Pessoa>()
val filaNormal = Fila<Pessoa>()

fun main() {
    //Preenchendo uma fila nova
    iniciarFila()

    val ze = Atendente("Ze Taldo Fulano")

    ze.iniciarAtendimento(filaPrioridade = filaComPrioridade, filaNormal = filaNormal)
}

private fun iniciarFila() {
    val randomFila = Random.nextInt(8, 12)
    val randomFilaNormal = Random.nextInt(10, 28)

    for (i in 0..randomFila) {
        val idadePrioridade = Random.nextInt(55, 80)
        filaComPrioridade.add(Pessoa("Pessoa $i", idadePrioridade, PrioridadeSenha.PRIORITARIA))

    }

    for (i in 0..randomFilaNormal) {
        val idadeNormal = Random.nextInt(12, 54)
        filaNormal.add(Pessoa("Pessoa $i", idadeNormal, PrioridadeSenha.NORMAL))
    }

}

//Para diferentes implementações
private fun getRandomPrioridade(): PrioridadeSenha {
    val prioridadeRole = Random.nextInt(0, 2)

    return if (prioridadeRole == 1) PrioridadeSenha.NORMAL else PrioridadeSenha.PRIORITARIA
}

data class Pessoa(val nome: String, val idade: Int, val senha: PrioridadeSenha) : Comparable<Pessoa> {
    override fun compareTo(outraPessoa: Pessoa): Int {
        if (outraPessoa.senha > this.senha) {
            return 1
        } else if (outraPessoa.senha == this.senha) {
            return 0
        }
        return -1
    }

}

data class Atendente(val nome: String) {
    fun iniciarAtendimento(filaPrioridade: Fila<Pessoa>, filaNormal: Fila<Pessoa>) {
        var contador = 0
        while (filaPrioridade.naoEstaVazio() || filaNormal.naoEstaVazio()) {

            if (contador == 3) {
                filaNormal.pool()?.let {
                    println("Atentido: $it")
                }
                contador = 0
            } else {
                filaPrioridade.pool()?.let {
                    println("Atentido: $it")
                }
                contador++
            }

            if (filaComPrioridade.estaVazio()) {
                filaNormal.pool()?.let {
                    println("Atentido: $it")
                }
            }
        }


    }
}

enum class PrioridadeSenha(i: Int) : Comparable<PrioridadeSenha> {
    NORMAL(0),
    PRIORITARIA(1);
}
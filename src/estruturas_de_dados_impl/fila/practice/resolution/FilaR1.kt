package estruturas_de_dados_impl.fila.practice.resolution

import estruturas_de_dados_impl.fila.Fila

fun main(){
    val filaDocumentos = Fila<Documento>()

    for (i in 0..7){
        filaDocumentos.add(Documento("Documento $i", i*20))
    }

    var count  = 0

    while (filaDocumentos.naoEstaVazio()){
        filaDocumentos.pool()?.let { imprimirDocumento(it) }
        count++
    }
}

private fun imprimirDocumento(documento: Documento){
    var message = StringBuilder()
    var time = 500

    print("Imprimindo ")
    for(i in 0..2){
        message.append(".")
        print(message)
        Thread.sleep((time+documento.qtdFolhas).toLong())
        message.append(".")
    }
    println()
    println("=-=-=-=-==-=-=-=-=-=")
    println("Documento Impresso! -> $documento")
    println("=-=-=-=-==-=-=-=-=-=")
}

private data class Documento(val nome: String, val qtdFolhas: Int)
package estruturas_de_dados_impl.vetor

import estruturas_de_dados_impl.base.CommonListStruct


class Vetor<T>(capacidade: Int): CommonListStruct<T>(capacidade, "Vetor"){

    constructor() : this(10)

    fun add(element: T){
        super.CLadd(element)
    }

    fun add(position: Int,element: T){
        super.CLadd(position, element)
    }

    fun clone (): Vetor<T?>{
        val list =  super.CLclone()
        return  super.toVetor(list)
    }
    operator fun get(posicao: Int): T? {
        return super.CLGet(posicao = posicao)
    }
    operator fun get(elemento: T): Int {
        return super.CLGet(elemento = elemento)
    }
}
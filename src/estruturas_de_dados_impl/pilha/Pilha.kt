package estruturas_de_dados_impl.pilha

import estruturas_de_dados_impl.base.CommonListStruct

class Pilha<T>(capacidade: Int) : CommonListStruct<T>(capacidade, "Pilha") {
    constructor() : this(10)

    fun empilhar(elemento: T) {
        super.CLadd(elemento)
    }

    fun desempilhar(): T? {
        if (super.estaVazio()) {
            return null
        } else {
            val elemento = super.elementos[--super.tamanho]
            super.elementos[super.tamanho] = null
            return elemento
        }
    }



fun topo(): T? {
    if (super.estaVazio()) {
        return null
    }
    return super.CLGet(tamanho - 1)
}


}
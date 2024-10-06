package estruturas_de_dados_impl.fila

class FilaComPrioridade<T>(capacidade: Int): Fila<T>(capacidade) {

    constructor() : this(10)
    override fun add (element: T) {

        val toCompare = element as Comparable<T>

        var position = 0
        while (position < tamanho) {
            if (toCompare.compareTo(elementos[position]!!) < 0) {
                break
            }
            position++
        }

        super.add(position, element)
    }


}
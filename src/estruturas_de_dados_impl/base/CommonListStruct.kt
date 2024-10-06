package estruturas_de_dados_impl.base
import estruturas_de_dados_impl.vetor.Vetor


//Estrutura genérica usada como classe PAI
//Classes como Vetor e Pilha, pode usar seu metodos publicos diretamente

//Nomeclatura de metodos
//CL(Commom List)+objetivo()
// Exemplo: CLAdicionar(), CLRemover() ...

open class CommonListStruct<T>(capacidade: Int, tipoLista: String) {
    private var elemento: T? = null
    protected open var tamanho: Int = 0
    protected open var elementos: ArrayList<T?> = arrayListOf()
    private val tipo = tipoLista

    init {
        for (i in 0..<capacidade) {
            elementos.add(elemento)
        }
    }

    protected open fun CLadd(valor: T) {
        addSize()
        if (tamanho < elementos.size) {
            elementos[tamanho] = valor
            tamanho++
        } else {
            throw IndexOutOfBoundsException("Vetor no tamanho máximo")
        }

    }

    protected open fun CLadd(posicao: Int, valor: T) {

        validarPosicao(posicao)

        addSize()

        for (i in tamanho - 1 downTo posicao) {
            elementos[i + 1] = elementos[i]
        }

        elementos[posicao] = valor

        tamanho++
    }

    private fun validarPosicao(posicao: Int) {
        if (posicao > tamanho) {
            throw IllegalArgumentException("Indice $posicao fora do vetor de tamanho ${tamanho}")
        }
    }

    private fun addSize() {
        if (tamanho == elementos.size) {

            val novosElementos = arrayListOf<T?>()

            for (i in 0..elementos.size * 2) {
                novosElementos.add(elemento)
            }

            for (i in 0..<elementos.size) {
                novosElementos[i] = elementos[i]
            }

            elementos = novosElementos

        }
    }

    fun primeiroOuNull(): T?{
        val element = elementos[0]
        element?.let {
            return  element
        }
        return null
    }

    override fun toString(): String {
        val string = StringBuilder()

        for (i in 0..<length()){
            val element = CLGet(i)
            if (element != null) {
                string.append("{${element}}")
            }

            if (length()-1 > i){
                string.append(",")
            }
        }

        return "$tipo[${string}]"

    }

    protected open fun CLGet(posicao: Int): T? {
        validarPosicao(posicao)

        return elementos[posicao]
    }

    open fun contains(elemento: T?): Boolean {
        return CLGet(elemento) != -1
    }

    protected open fun CLGet(elemento: T?): Int {
        var posicao: Int = -1
        for (i in 0..<tamanho) {
            if (elementos[i] == elemento) {
                posicao = i
            }
        }
        if (posicao == 0) {
            throw IndexOutOfBoundsException("Elemento ${elemento} não existe no vetor")
        }
        return posicao
    }

    protected open fun CLclone(): CommonListStruct<T?> {
        val newArray = CommonListStruct<T?>(tamanho, tipo)

        for (element in elementos) {
            element?.let {
                newArray.CLadd(it)
            }
        }

        return newArray
    }

    fun toVetor(list: CommonListStruct<T?>): Vetor<T?> {
        val vetor = Vetor<T?>()

        for (i in 0..<list.length()){
            elementos[i]?.let { vetor.add(it) }
        }

        return vetor
    }

    fun length(): Int {
        return tamanho
    }

    fun clear() {
        for (i in 0..<elementos.size) {
            elementos[i] = null
        }
        tamanho = 0
    }

    fun estaVazio() = tamanho == 0

    fun naoEstaVazio() = !estaVazio()

    fun lastIndexOf(elemento: T?): Int{
        var posicao: Int = -1
        for (i in 0..tamanho) {
            if (elementos[i] == elemento) {
                posicao = i
            }
        }
        if (posicao == 0) {
            throw IndexOutOfBoundsException("Elemento ${elemento} não existe no vetor")
        }
        return posicao
    }

    fun remove(posicao: Int) {
        validarPosicao(posicao)

        for (i in posicao..<tamanho) {
            elementos[i] = elementos[i + 1]
        }

        tamanho--
    }

    fun remove(elemento: T?) {
        remove(CLGet((elemento)))
    }

}

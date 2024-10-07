package avancado.padroes_de_projeto.observer


class ListaState : Observer<ArrayList<String>> {

    var value = arrayListOf<String>()

    override fun update(state: ArrayList<String>) {
        value = state
    }
}

fun main() {
    // Criando o Subject que vai gerenciar a lista de frutas
    val frutasSubject = Subject<ArrayList<String>>()

    // Criando o Observer que irá observar a lista de frutas
    val listaState = ListaState()

    // Adicionando o Observer no Subject
    frutasSubject.add(listaState)

    // Criando a lista de frutas inicial
    val listaDeFrutas = arrayListOf("Maçã", "Banana", "Laranja")

    // Setando o estado inicial da lista de frutas no Subject
    frutasSubject.setState(listaDeFrutas)

    // Adicionando uma fruta
    listaDeFrutas.add("Uva")
    frutasSubject.setState(listaDeFrutas)

    // Removendo uma fruta
    listaDeFrutas.remove("Banana")
    frutasSubject.setState(listaDeFrutas)

    // Adicionando outra fruta
    listaDeFrutas.add("Manga")
    frutasSubject.setState(listaDeFrutas)

    frutasSubject.close(listaState)

    // Verificando a lista final mantida no Observer
    println("Lista final de frutas no Observer: ${listaState.value}")
}


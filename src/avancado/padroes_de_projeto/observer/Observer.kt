package avancado.padroes_de_projeto.observer

interface Observer<T> {
    fun update(state: T)
}

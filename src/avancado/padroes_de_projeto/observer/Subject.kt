package avancado.padroes_de_projeto.observer

class Subject<T> {
    private val observers = mutableListOf<Observer<T>>()
    private var state: T? = null

    fun add(observer: Observer<T>) {
        observers.add(observer)
    }

    fun close(observer: Observer<T>) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        state?.let { newState ->
            for (observer in observers) {
                observer.update(newState)
            }
        }
    }

    fun setState(newState: T) {
        state = newState
        notifyObservers()
    }

    fun getState(): T? {
        return state
    }
}

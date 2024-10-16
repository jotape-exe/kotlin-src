package avancado.padroes_de_projeto.state.coffe_machine

// Contexto que mantém a referência para o estado atual
class CoffeeMachine(private var waterAmount: Int) {
    val readyState: CoffeeMachineState = ReadyState(this)
    val brewingState: CoffeeMachineState = BrewingState(this)
    val noWaterState: CoffeeMachineState = NoWaterState(this)

    private var currentState: CoffeeMachineState = if (waterAmount > 0) readyState else noWaterState

    val hasWater: Boolean
        get() = waterAmount > 0

    fun setState(state: CoffeeMachineState) {
        currentState = state
    }

    fun consumeWater() {
        waterAmount--
    }

    fun refillWater(amount: Int) {
        waterAmount += amount
        println("Reabastecido com $amount unidades de água.")
        currentState.refillWater()
    }

    fun insertCoin() {
        currentState.insertCoin()
    }

    fun makeCoffee() {
        currentState.makeCoffee()
    }
}
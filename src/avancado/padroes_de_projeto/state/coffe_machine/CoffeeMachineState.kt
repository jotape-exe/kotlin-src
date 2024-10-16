package avancado.padroes_de_projeto.state.coffe_machine

interface CoffeeMachineState {
    fun insertCoin()
    fun makeCoffee()
    fun refillWater()
}
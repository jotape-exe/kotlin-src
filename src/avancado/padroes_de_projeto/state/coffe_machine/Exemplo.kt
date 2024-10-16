package avancado.padroes_de_projeto.state.coffe_machine

fun main() {
    val coffeeMachine = CoffeeMachine(waterAmount = 1) // Inicializa com 1 unidade de água

    coffeeMachine.insertCoin()  // Moeda inserida. Preparando café...
    coffeeMachine.makeCoffee()  // Café sendo preparado...

    coffeeMachine.insertCoin()  // Sem água. Por favor, reabasteça a máquina.
    coffeeMachine.makeCoffee()  // Sem água. Não é possível fazer café.

    // Reabastecer água com 2 unidades
    coffeeMachine.refillWater(2)  // Reabastecido com 2 unidades de água. Água reabastecida. A máquina está pronta.

    coffeeMachine.insertCoin()  // Moeda inserida. Preparando café...
    coffeeMachine.makeCoffee()  // Café sendo preparado...
}

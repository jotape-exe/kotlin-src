package avancado.padroes_de_projeto.state.coffe_machine


// Implementação do estado Pronta
class ReadyState(private val machine: CoffeeMachine) : CoffeeMachineState {
    override fun insertCoin() {
        println("Moeda inserida. Preparando café...")
        machine.setState(machine.brewingState)
    }

    override fun makeCoffee() {
        println("Insira uma moeda primeiro.")
    }

    override fun refillWater() {
        println("Água suficiente. A máquina está pronta.")
    }
}

// Implementação do estado Fazendo Café
class BrewingState(private val machine: CoffeeMachine) : CoffeeMachineState {
    override fun insertCoin() {
        println("Já estamos fazendo seu café.")
    }

    override fun makeCoffee() {
        println("Café sendo preparado...")
        machine.consumeWater()
        machine.setState(if (machine.hasWater) machine.readyState else machine.noWaterState)
    }

    override fun refillWater() {
        println("Aguarde até o café ficar pronto.")
    }
}

// Implementação do estado Sem Água
class NoWaterState(private val machine: CoffeeMachine) : CoffeeMachineState {
    override fun insertCoin() {
        println("Sem água. Por favor, reabasteça a máquina.")
    }

    override fun makeCoffee() {
        println("Sem água. Não é possível fazer café.")
    }

    override fun refillWater() {
        println("Água reabastecida. A máquina está pronta.")
        machine.setState(machine.readyState)
    }
}

package avancado.padroes_de_projeto.builder

class Computer {
    var cpu: String = ""
    var ram: Int = 0
    var storage: Int = 0
    var gpu: String = ""

    override fun toString(): String {
        return "Computer(cpu='$cpu', ram=$ram, storage=$storage, gpu='$gpu')"
    }
}

class ComputerBuilder {
    var cpu: String = ""
    var ram: Int = 0
    var storage: Int = 0
    var gpu: String = ""

    fun build(): Computer {
        val computer = Computer()
        computer.cpu = cpu
        computer.ram = ram
        computer.storage = storage
        computer.gpu = gpu
        return computer
    }
}

fun computer(block: ComputerBuilder.() -> Unit): Computer {
    val builder = ComputerBuilder()
    builder.apply(block)
    return builder.build()
}

fun main() {
    val myComputer = computer {
        cpu = "Intel i9"
        ram = 32
        storage = 1024
        gpu = "NVIDIA RTX 3090"
    }

    println(myComputer)
}

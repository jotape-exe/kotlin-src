package avancado.padroes_de_projeto.builder

class Car private constructor(
    val brand: String?,
    val model: String?,
    val year: Int?,
    val color: String?
) {

    // Builder interno
    class Builder {
        private var brand: String? = null
        private var model: String? = null
        private var year: Int? = null
        private var color: String? = null

        fun brand(brand: String) = apply { this.brand = brand }
        fun model(model: String) = apply { this.model = model }
        fun year(year: Int) = apply { this.year = year }
        fun color(color: String) = apply { this.color = color }

        fun build(): Car {
            return Car(brand, model, year, color)
        }
    }
}

fun main() {
    val car = Car.Builder()
        .brand("Toyota")
        .model("Corolla")
        .year(2020)
        .color("Red")
        .build()

    println("Car: ${car.brand}, ${car.model}, ${car.year}, ${car.color}")
}

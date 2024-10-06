package funcoes

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    // Sobrecarga do operador -
    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }
}

fun main() {
    val p1 = Point(5, 7)
    val p2 = Point(3, 2)

    val result = p1 - p2  // Isso chama a função 'minus'
    println(result)  // Saída: Point(x=2, y=5)
}

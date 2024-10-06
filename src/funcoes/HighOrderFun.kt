package funcoes

// Parameters
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y
fun multiply(x:Int, y:Int) = x * y

// Returning
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x


fun main() {

    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println("sumResult $sumResult, mulResult $mulResult")
    println(calculate(7, 6, ::multiply))

    val func = operation()
    println(func(2))

}
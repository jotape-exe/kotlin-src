package desctructing

data class Result(val message: String, val code: Int)

fun exemploPair(): Pair<String, Int>{
    return "João" to 22
}

fun main() {
    fun getApi(): Result {
        return Result("OK", 200)
    }

    fun getApiErro() {
        val result = Result("INTERNAL SERVER ERROR", 500)

        val (_, code) = result
        println("Deu ERROR: $code")

    }

    val (message, code) = getApi()

    println("Status $code $message")

    getApiErro()

    val (nome, idade) = exemploPair()

    println("$nome tem $idade anos")

}
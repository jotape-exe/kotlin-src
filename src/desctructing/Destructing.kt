package desctructing

data class Result(val message: String, val code: Int)

fun main() {
    fun getApi(): Result {
        return Result("OK", 200)
    }

    fun getApiErro() {
        val result = Result("INTERNAL SERVER ERROR", 500)

        val (_, code) = result
        println("Deu PAU $code")

    }

    val (message, code) = getApi()

    println("Status $code $message")

    getApiErro()


}
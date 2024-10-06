package funcoes

fun logCreation(dev: Dev) = println("${dev.name} as created!")

fun main() {

    // -=-=-=-=-= ALSO =-=-=-=-=-=-=
    val marcus = Dev("Marcus", "C++")
        .also {
            logCreation(it)
        }

    // -=-=-=-=-= APPLY =-=-=-=-=-=-=
    val jake = Dev()
    val descrptionObj = jake.apply {
        name = "Jake"
        lang = "Kotlin"
    }.toString()

    println(descrptionObj)

    // -=-=-=-=-= LET =-=-=-=-=-=-=
    fun printUpper(str: String) {
        print("$str -> ${str.uppercase()}")
    }

    fun printNonNull(str: String?) {
        println("Result -> \"$str\": ")

        str?.let {
            printUpper(it)
        }
    }

    fun doubleLet(strOne: String?, strTwo: String?) {
        strOne?.let { firstIt ->
            strTwo?.let { secondIt ->
                printUpper("[ $firstIt ]--[ $secondIt]")
            }

        }
    }

    val strEmpty = "String".let {
        printUpper(it)
        it.isEmpty()
    }

    println(" Is empty? $strEmpty")
    doubleLet("first value", "last value")

    // =-=-=-=-=-= RUN =-=-=-=-=-=-=
    fun randomFunc(param: String?) {
        println("Parametrer -> $param ")

        param?.run {
            println("is empty? ${isEmpty()}")
            println("Length: $length")
            println("$param == \"ramdom\" ? ${param == "random"} ")
        }
    }


    randomFunc("random")
    randomFunc("Aleatorio")
    randomFunc(null)


    // =-=-=-=-=-= WITH =-=-=-=-=-=-=
    val config = ConfigFake("http://localhost:","3000")

    with(config){
        println(host+port)
    }

    config.run {
        println(host+port)
    }


}
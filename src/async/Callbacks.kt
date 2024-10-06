package async

fun chamadaFakeApi(mensagem: String){
    println(mensagem)
}

// Função que recebe um callback
fun executarComCallback(apiCallback: () -> Unit) {
    println("Executando tarefa principal...")

    // Simulando a conclusão da tarefa principal
    Thread.sleep(2000)

    println("Tarefa principal concluída.")

    // Executa o callback
    apiCallback()
}

fun main() {
    executarComCallback {
        chamadaFakeApi("Callback executado!")
    }
}

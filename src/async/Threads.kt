package async

data class Token(val exp: Long, val iat: Long)
data class Item(val id: Long, val titulo: String)

fun enviarPost(token: Token?, item: Item): String {
    return if(token!== null) "Enviando... ${item.titulo}" else ""
}

fun processarPost(post: String) {
    println("$post enviado com sucesso")
}

fun postar(item: Item) {
    val token = preparePost()
    val post = enviarPost(token, item)
    processarPost(post)
}

fun preparePost(): Token {
    return Token(12444112, 3123344)
}

fun postarEmThreads(items: List<Item>) {
    val threads = mutableListOf<Thread>()

    for (item in items) {
        val thread = Thread {
            postar(item)
        }
        threads.add(thread)

        // Inicia a thread
        thread.start()
    }

    // Aguardando todas as threads terminarem
    for (thread in threads) {
        thread.join()
    }
}

fun main() {
    val items = listOf(
        Item(1, "Post 1"),
        Item(2, "Post 2"),
        Item(3, "Post 3")
    )

    postarEmThreads(items)
    println("Todos os posts foram processados.")
}

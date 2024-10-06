package funcoes

class Html {
    private val children = mutableListOf<Body>()

    fun body(init: Body.() -> Unit) {
        val body = Body()
        body.init()
        children.add(body)
    }

    override fun toString(): String {
        return "<html>\n${children.joinToString("\n")}\n</html>"
    }
}

class Body {
    private val children = mutableListOf<Div>()

    fun div(init: Div.() -> Unit) {
        val div = Div()
        div.init()
        children.add(div)
    }

    override fun toString(): String {
        return "<body>\n${children.joinToString("\n")}\n</body>"
    }
}

class Div {
    var text = ""

    override fun toString(): String {
        return "<div>$text</div>"
    }
}

fun html(init: Html.() -> Unit): Html {
    val html = Html()
    html.init()
    return html
}

fun main() {
    val document = html {
        body {
            div {
                text = "Hello, World!"
            }
            div {
                text = "This is a type-safe builder in Kotlin!"
            }
        }
    }

    println(document)
}

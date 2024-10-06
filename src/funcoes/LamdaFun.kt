package funcoes

val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

val upperCase3 = { str: String -> str.uppercase() }                     // 3

// val upperCase4 = { str -> str.uppercase() }                          // 4

val upperCase5: (String) -> String = { it.uppercase() }                 // 5

val upperCase6: (String) -> String = String::uppercase                  // 6

fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}
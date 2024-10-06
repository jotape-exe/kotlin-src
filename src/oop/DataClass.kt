package oop


//Mais utilizado em api's
data class User(private var id:Long, private var username:String, private var password:String){

    override fun equals(other: Any?) = other is User && other.id == this.id

}

fun main() {
    val user1 = User(1L, "joao", "@joao000")
    val user2 = User(2L, "pedro", "Pietrorxz")
    val user11 = User(1L, "joao", "@joao000")

    println(user1.hashCode())
    println(user11.hashCode())


    println(user1 == user2)
    println(user1 == user11)

    println("$user1 \n$user2")

}
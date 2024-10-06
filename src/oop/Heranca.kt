package oop

open class Dog{
    open fun sayHello(){
        println("wow wow!")
    }
}

class ChoWChow: Dog(){
    override fun sayHello() {
        println("WOF WOF!")
    }
}

open class Jedi(val saberColor:String){
    fun showSaber (){
        println("The Jedi has a saber $saberColor")
    }
}

class Luke: Jedi("Green")
class Anakin: Jedi("Blue")

fun main() {
    val dog:Dog = ChoWChow()
    dog.sayHello()

    println("-=-=-=-=-=-=-=-=-=-=")
    val luke = Luke()
    luke.showSaber()

    val anakin = Anakin()
    anakin.showSaber()

}
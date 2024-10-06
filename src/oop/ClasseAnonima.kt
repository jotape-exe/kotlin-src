package oop

interface EventKotlin{
    fun conversarComJava()
}

class Form{
    fun eventKotlin(eventoKotlin: EventKotlin){

    }

    fun eventJava(eventoJava: EventJava){

    }
}

class AnonimousClass {
    fun main(){

        Form().eventKotlin(object : EventKotlin{
            override fun conversarComJava() {
                println("conversando com java")
            }

        })

        //SAM Conversion - Single Abstract Method
        //Para interfaces com a apenas um metodo
        Form().eventJava {
            println("conversando com kotlin")
        }
    }
}
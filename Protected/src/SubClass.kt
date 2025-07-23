

open class AnimalZoo{
    protected val name: String = "Animal"

    fun printName(){
        println(name)
    }
}

class Leo : AnimalZoo(){
    fun printNameCat(){
        println(name)
    }
}

fun main() {
    val NameLeo = Leo()
    NameLeo.printName()
    NameLeo.printNameCat()
}
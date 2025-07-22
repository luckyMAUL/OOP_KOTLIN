

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Duck : Flyable, Swimmable {
    override fun fly() = println("Duck is flying")
    override fun swim() = println("Duck is swimming")
}

fun main(){
    val duck = Duck()
    duck.fly()  // Output: Duck is flying
    duck.swim() // Output: Duck is swimming
}
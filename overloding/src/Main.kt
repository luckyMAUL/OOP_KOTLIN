//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Animal(private var name: String){
    fun eat(){
        println("$name is eating")
    }
    fun eat(tyFood: String){
        println("$name is eating $tyFood")
    }
    fun eat(tyFood: String, quantity: Double){
        println("$name is eating $quantity kg of $tyFood")
    }
    fun sleep(){
        println("$name is sleeping")
    }
}
fun main(){
    val dog = Animal("Dog")
    dog.eat()
    dog.eat(("meat"))
    dog.eat("meat", 2.5)
}
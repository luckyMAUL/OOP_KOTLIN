//=========Inheritances/pewarisan=====


open  class Animal{
    open fun eat(): String{
        return "Animal is eating "
    }
}
class Dog: Animal(){
    override fun eat(): String{
        return "Dog is eating "
    }
}
class Cat: Animal(){
    override fun eat(): String{
        return "Cat is eating "
    }
}
fun main(){
    val animal : Animal = Dog()
    println(animal.eat())
    
    val animal2 : Animal = Cat()
    println(animal2.eat())



}
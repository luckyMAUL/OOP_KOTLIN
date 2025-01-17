
//==== Overloading====
class players{
    fun user(name: String): String{
        return "your name is $name"
    }
    fun user(name: String, age: Int): Any{
        return "your name is $name and your age is $age"
    }
    fun uer(name: String, age: Int,level: Int): Any{
        return "your name is $name, your age is $age and your level is $level"
    }
}
//===== Polymorphism=====

open class Animal{
    open fun sound(){
        println("Animal makes sound")
    }
}
class Dog: Animal(){
    override fun sound(){
        println("Dog barks")
    }
}
class Cat: Animal(){
    override fun sound(){
        println("Cat meows")
    }
}
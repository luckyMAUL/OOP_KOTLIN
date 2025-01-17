package superFun

open class Animal(val name: String){
    open fun eat(){
        println("$name is eating")
    }
}

class cat(InputName: String): Animal(InputName){
    override fun eat(){
        println("$name is eating fish")
    }
}
fun main(){
    val myCat = cat("kitty")
    myCat.eat()
}
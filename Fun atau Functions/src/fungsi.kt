

fun Panggil(name: String,age: Int){
    println("Name: $name, Age: $age")
}

class Players(name: String,age: Int){
    init {
       Panggil(name,age)
    }
}

class Wepon(val name: String,val power: Int){
    fun panggil(){
        println("Name: $name, Power: $power")
    }
}

fun main(){
    //println(Players("messi", 34))
    val players = Players("messi", 34)

    val katana = Wepon("katana", 100)
    katana.panggil()
}


class Wepon(name: String,power: Double,strength: Int){
    val power = power
    val name = name

    constructor(name: String,power: Double):this(name,power,150){
        //CekPowe()
    }
    init {
        CekPowe()
    }
    private fun CekPowe(){
        if (power >= 1500){
            println("Senjata anda $name termasuk senjata legendaris")
        }else{
            println("senjata anda $name senjata biasa")
        }
    }

}

fun main(){
    var katana = Wepon("katana",2000.0)
    println(katana.name)
    println(katana.power)
}
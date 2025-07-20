

class Players(name: String, power: Double, level: Int) {
    val Name = name
    val Power = power
    val Level = level

    init {
        if (power < 0) {
            println("Power tidak boleh negatif!")
        }else{
            println("power masuk level 1")
        }
    }

    // Secondary constructor
    constructor(name: String, power: Double) : this(name, power, 1) {
        // Inisialisasi tambahan

    }
}

fun main(){
    val newPlayers = Players("ucup",12.5,5)
    println(newPlayers.Name)
    println(newPlayers.Power)
    println(newPlayers.Level)

}
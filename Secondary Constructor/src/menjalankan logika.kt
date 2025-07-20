

class Player(val name: String, var level: Int) {

    // Constructor sekunder dengan default level 1
    constructor(name: String) : this(name, 1) {
        println("$name bergabung dengan level 1!")
    }

    // Constructor sekunder untuk mengecek level negatif
    constructor(name: String, level: Int, isValid: Boolean) : this(name, if (level < 1) 1 else level) {
        if (level < 1) println("Level tidak boleh negatif, diatur ke level 1")
    }
}

fun main() {
    val player1 = Player("Ucup")
    val player2 = Player("Joko", -3, true) // Level negatif diubah ke 1
    val player3 = Player("Cecep")

    println("${player2.name} - Level: ${player2.level}")
}
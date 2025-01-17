


    fun main() {
        val userPlayers = players()
        userPlayers.user("john")
        userPlayers.user("john", 20)
        userPlayers.uer("john", 20, 5)

        val animals: List<Animal> = listOf(Dog(), Cat(), Animal())
        animals.forEach { println(it.sound()) }

    }

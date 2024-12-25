//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class players{
    abstract val name: String
    abstract fun play()
}

class PlayersUser: players(){
    override val name: String ="players: messi"
    override fun play(){
        println("play game")
    }
}
fun main(){
    val user = PlayersUser()
    user.play()
    println("name: ${user.name}")

}
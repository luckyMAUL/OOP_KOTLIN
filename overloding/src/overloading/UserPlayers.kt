package overloading

class players(private val name: String){
    fun play(){
        println("$name is playing")
    }
    fun play(level: Int){
        println("$name is playing at level $level")
    }
    fun play(level: Int, score: Int){
        println("$name is playing at level $level and scored $score")
    }fun sleep(){
        println("$name is sleeping")
    }
}
fun main(){
    val playersName = players("john")
    playersName.play()
    playersName.play(8)
    playersName.play(8, 100)
    playersName.sleep()

}



// dengan open
open class Hewam(){
    open fun suara(){
        println("Hewan bersuara")
    }
}

open class Kucing:Hewam(){
    override fun suara(){
        println("meong! meong!")
    }
}

// dengan abstract
abstract  class Players(){

    abstract fun NameUser()
}
class Ucup:Players(){
    override fun NameUser() {
       println("name Players: ucup")
    }
}
fun main(){
    val kucing = Kucing()
    kucing.suara()

    val PlayersUcup = Ucup()
    PlayersUcup.NameUser()
}
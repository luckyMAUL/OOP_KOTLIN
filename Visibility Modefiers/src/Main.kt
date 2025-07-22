


class Animal(private var name: String,private val weight: Double,private val age: Int){

    fun getName(): String{
        return name
    }
    fun getWeight(): Double{
        return weight
    }

    fun setName(newName: String){
        name = newName
    }
    fun panggil(name: String,weight: Double,age: Int){
        println("nama hewan: $name umur  : ${age} berat : $weight ")
    }
}
fun main(){
    val newName = Animal("cat",3.3,5)
   
    newName.panggil("Dog",3.3,3)
    newName.panggil("Cat",2.3,3)

    newName.setName("kuda")

}
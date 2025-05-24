



class Animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal

    }
}

fun main(){
    val newAnimal = Animal("Cat",1.1,4,true)
    println(newAnimal.name)
    println(newAnimal.weight)
    println(newAnimal.age)
    println(newAnimal.isMammal)
}
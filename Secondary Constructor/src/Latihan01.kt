

class CarBuy(name: String,age: Int,speed: Double){
    val name: String = name
    val age: Int = age
    val speed: Double = speed

    constructor(name: String,age: Int,): this(name,age,120.0){
        CekCar()
    }

    private fun CekCar(){
        if (age >= 8){
            println("MOBIL SUDAH TUA")
        }else{
            println("MASIH JANGKAUWAN MUDA")
        }
    }
}

fun main(){
    println(CarBuy("Toyota ae86",15))

    val BMWf30 = CarBuy("BMWf30",2)
    println(BMWf30.name)
    println(BMWf30.age)
    println(BMWf30.speed)
}
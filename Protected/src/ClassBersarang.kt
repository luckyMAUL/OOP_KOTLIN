

open class Computer{
    protected class Processor(val name: String, val core: Int){
        fun printProcessor(){
            println("Processor: $name with core $core")
        }
    }
}

class Laptop : Computer(){
    fun printProcessorLaptop(){
        val processor = Processor("Intel Core i7", 8)
        processor.printProcessor()
    }
}


fun main(){

    val laptop = Laptop()
    laptop.printProcessorLaptop()

}
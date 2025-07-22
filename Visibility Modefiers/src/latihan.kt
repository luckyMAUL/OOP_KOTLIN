private val fileSecret = "Ini adalah rahasia file" // Variabel private di tingkat file
val umum ="ini file umum"


class ContohLain {
    fun displayFileSecret() {
        println(fileSecret) // Bisa diakses karena dalam file yang sama
    }
}

fun main() {
    println(fileSecret) // Bisa diakses karena dalam file yang sama
    val obj = ContohLain()
    obj.displayFileSecret() // Output: Ini adalah rahasia file

    println(umum)
    println(fileSecret)
}

class Outer {
    private val outerSecret = "Rahasia Outer" // Property private di Outer

    inner class Inner {
        fun displaySecret() {
            println(outerSecret) // Bisa diakses karena Inner Class adalah bagian dari Outer
        }
    }
}

fun main() {
    val outer = Outer()
    val inner = outer.Inner()
    inner.displaySecret() // Output: Rahasia Outer

    // Error! Tidak bisa mengakses property private dari luar kelas Outer
    // println(outer.outerSecret)
}
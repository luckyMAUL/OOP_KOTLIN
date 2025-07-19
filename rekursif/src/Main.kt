import kotlin.math.exp

fun factorial(n: Int, depth: Int = 0): Int {
    if (n < 0 ) {
        println("Input harus bilangan bulat non-negatif.")
        return -1
    }

    val indent = " ".repeat(depth)

    if (n == 0) {
        println("${indent}factorial(0) = 1")
        return 1
    } else {
        println("${indent}factorial($n) = $n * factorial(${n - 1})")
        var hasil = n * factorial(n - 1)
        println("Mengembalikan $hasil untuk factorial $n")
        return hasil
    }
}

fun main() {
    println("Hasil: ${factorial(5)}")
}

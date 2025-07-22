
class Contoh {
    private val secretMessage = "Ini adalah pesan rahasia" // Property private

    fun displaySecret() {
        println(secretMessage) // Bisa diakses karena dalam scope yang sama (kelas Contoh)
    }
}

fun main() {
    val obj = Contoh()
    obj.displaySecret() // Output: Ini adalah pesan rahasia

    // Error! Tidak bisa mengakses property private dari luar kelas
    // println(obj.secretMessage)
}
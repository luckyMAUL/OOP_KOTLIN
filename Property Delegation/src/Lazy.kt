import Example.HeavyInitialization

class Example {
    val name: String by lazy {
        println("Inisialisasi name...")
        "Kotlin"
    }
    class HeavyInitialization {
        val heavyProperty: String by lazy {
            println("Melakukan inisialisasi yang mahal...")
            // Simulasikan inisialisasi yang memakan waktu
            Thread.sleep(2000)
            "Inisialisasi Selesai"
        }
    }
}

fun main() {
    val obj = Example()
    println(obj.name) // Inisialisasi terjadi di sini
    println(obj.name) // Tidak diinisialisasi ulang
    println(obj.name) // Tidak diinisialisasi ulang


    val objOn = HeavyInitialization()
    println("Objek dibuat, tetapi heavyProperty belum diinisialisasi.")

    println(objOn.heavyProperty) // Inisialisasi terjadi di sini
    println(objOn.heavyProperty)
}

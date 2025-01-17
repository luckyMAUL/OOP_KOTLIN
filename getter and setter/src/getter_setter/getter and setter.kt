package getter_setter

class Person {
    private var _name: String = "Unknown" // Variabel privat untuk menyimpan data

    // Getter untuk name
    fun getName(): String {
        return _name
    }

    // Setter untuk name
    fun setName(newName: String) {
        if (newName.isNotBlank()) {
            _name = newName
        } else {
            println("Nama tidak boleh kosong!")
        }
    }
}

fun main() {
    val person = Person()

    // Menggunakan setter
    person.setName("Budi")
    println("Nama: ${person.getName()}") // Output: Nama: Budi

    // Coba memberikan nilai kosong
    person.setName("")
    println("Nama: ${person.getName()}") // Output: Nama tidak boleh kosong! Nama: Budi
}
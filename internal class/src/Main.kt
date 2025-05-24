/*
 fungsi, atau properti sebagai internal dalam Kotlin, itu berarti hanya dapat diakses dari
 dalam modul yang sama.
 */



internal class DatabaseHelper {
    fun connect() {
        println("Connected to database")
    }
}

class UserService {
    private val dbHelper = DatabaseHelper() // Bisa diakses karena dalam modul yang sama

    fun start() {
        dbHelper.connect()
    }
}

fun main() {
    val userService = UserService()
    userService.start()
}


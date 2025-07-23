

sealed class LoginState

object Idle : LoginState()
object Loading : LoginState()
data class Success(val username: String) : LoginState()
data class Error(val message: String) : LoginState()

// Sealed class untuk status login
sealed class LoginStatus

object LoginIdle : LoginStatus()
object LoginLoading : LoginStatus()
data class LoginSuccess(val username: String) : LoginStatus()
data class LoginError(val message: String) : LoginStatus()

fun handleLoginStatus(status: LoginStatus) {
    when (status) {
        is LoginIdle -> println("Belum login.")
        is LoginLoading -> println("Sedang login...")
        is LoginSuccess -> println("Selamat datang, ${status.username}!")
        is LoginError -> println("Login gagal: ${status.message}")
    }
}

fun main() {
    val loginStatuses: List<LoginStatus> = listOf(
        LoginIdle,
        LoginLoading,
        LoginSuccess("andi123"),
        LoginError("Password salah")
    )

    for (status in loginStatuses) {
        handleLoginStatus(status)
    }
}

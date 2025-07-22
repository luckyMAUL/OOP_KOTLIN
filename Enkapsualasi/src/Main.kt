

class BankAccount(private var balance: Double) {

    fun getBalance(): Double {
        return balance
    }

    // Fungsi untuk menambah saldo
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit sebesar $amount berhasil. Saldo sekarang: $balance")
        } else {
            println("Jumlah deposit harus lebih dari 0.")
        }
    }

        // Fungsi untuk menarik saldo
        fun withdraw(amount: Double) {
            if (amount > 0 && amount <= balance) {
                balance -= amount
                println("Penarikan sebesar $amount berhasil. Saldo sekarang: $balance")
            } else {
                println("Penarikan gagal! Saldo tidak mencukupi atau jumlah tidak valid.")
            }
        }

}

fun main() {
    val myAccount = BankAccount(1000.0) // Membuat objek dengan saldo awal 1000

    println("Saldo awal: ${myAccount.getBalance()}")

    myAccount.deposit(500.0)   // Deposit uang
    myAccount.withdraw(300.0)  // Tarik uang
    myAccount.withdraw(1000.0) // Gagal karena saldo tidak cukup
}
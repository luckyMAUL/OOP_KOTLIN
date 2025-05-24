import java.util.Scanner


fun main(){
    var x = 1
    for(i in x .. 6){
        println("*".repeat(i))
    }

    var y = 5
    for(i in y downTo 1){
        println("+".repeat(i))

    }

    //for(i in 1..3) {

        var Scanner = Scanner(System.`in`)

        print("masukan nilai : ")
        val nilaiSatu = readLine()!!.toInt()

        print("masukan nilai : ")
        val nilaiDua = readLine()!!.toInt()

        print("masukan nilai : ")
        val nilaiTiga = readLine()!!.toInt()


        fun terKecil(nilaiSatu: Int, nilaiDua: Int, nilaiTiga: Int): Int {
            if (nilaiSatu <= nilaiDua && nilaiSatu <= nilaiTiga) {
                return nilaiSatu
            } else if (nilaiDua <= nilaiSatu && nilaiDua <= nilaiTiga) {
                return nilaiDua
            } else {
                return nilaiTiga
            }
        }

    val hasil = terKecil(nilaiSatu, nilaiDua, nilaiTiga)
    println("hasilnya = $hasil")







//}




}
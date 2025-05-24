
class Rumah{
    private  val warnaDinding =  "putih"

    inner class kamar{
        fun deskripsi(){
            println("kamar ini memiliki dinding warna $warnaDinding")
        }
    }
}
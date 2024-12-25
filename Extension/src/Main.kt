
// Extensions menambahkan sebuah fungsi baru pada sebuah
// kelas tanpa harus mewarisi kelas tersebut

fun Int.intPrintln(){
    println(this)
}
fun Int.plusThree(): Int{
    return this + 3
}
fun Int.slice(): Int{
    return this * 2
}
// infix function
infix fun Int.add(value: Int): Int{
    return this + value
}
fun String.hello(){
    println("Hello $this")
}
fun main(){
    10.intPrintln()
    println(10.plusThree())
    println(5.slice())

    // infix function
    println(10 add 5)
    println("budi".hello())




}

val Int?.slice: Int
    get() = this?.div(2) ?: 0

val Int.slice1: Int
    get() = this.div(2)



fun main() {
    val value: Int? = null
    val value1: Int? = 10

    println(value.slice)

    println(value?.slice1)
    println(value1?.slice1)
}
import kotlin.reflect.KProperty

class CustomDelegate {
    private var value: String = "Default"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Membaca properti '${property.name}'")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        println("Mengubah '${property.name}' dari '$value' ke '$newValue'")
        value = newValue
    }
}

class Example1 {
    var name: String by CustomDelegate()
}

fun main() {
    val obj = Example1()
    obj.name = "Kotlin Delegation"
    println(obj.name)
}
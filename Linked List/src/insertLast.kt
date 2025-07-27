

class Node<T>(var data: T) {
    var next: Node<T>? = null
}

class LinkedList<T> {
    private var head: Node<T>? = null

    fun insertLast(data: T) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode // untuk menambahkan node baru di akhir
        }
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }
}

fun main() {
    val list = LinkedList<Int>()
    list.insertLast(10)
    list.insertLast(20)
    list.insertLast(30)
    list.insertLast(30)
    list.insertLast(20)
    list.insertLast(10)

    list.printList()
}

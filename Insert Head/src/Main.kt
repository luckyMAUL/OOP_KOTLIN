


class Note(var title: String){
    var content: Note? = null
}

class NoteBook{
    private var head:Note? =null

    fun LinkedList(title: String){
        val newNote =Note(title)
        newNote.content = head
        head = newNote
    }

    fun printlList(){
        var current = head
        while (current != null){
            println("${current.title}")
            current = current.content
        }
        println("null")
    }
}

fun main(){
    val linkedList = NoteBook()
    linkedList.LinkedList("kalkulus")
    linkedList.LinkedList("struktur data")
    linkedList.LinkedList("basis data")
    linkedList.printlList()

}
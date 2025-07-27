
class Note(var title: String) {
    var content: Note? = null
}

class NoteBook{
    private var head: Note? = null

    fun insertLast(title: String){
        val newNote = Note(title)

        if(head == null){
            head = newNote
        }else{
            var current = head
            while (current?.content != null){
                current = current.content
            }
            current?.content = newNote
        }
    }

    fun printNote(){
        var current = head
        while (current != null){
            println("Note: ${current.title}")
            current = current.content
        }
    }
}

fun main(){

    val myNote = NoteBook()
    myNote.insertLast("kalkulus")
    myNote.insertLast("basis data")
    myNote.insertLast("struktur data")
    myNote.printNote()

}


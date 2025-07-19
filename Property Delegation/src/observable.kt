

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Default") { prop, old, new ->
        println("Property ${prop.name} berubah dari '$old' ke '$new'")
    }
}

class UsePasword{
    var name: String by Delegates.observable("Default"){Pasword,PaswordNew,new->
        println("Pasword: ${Pasword.name} telah di ganti Pasword: $PaswordNew New Pasword: $new")
    }
}

fun main() {
    val user = User()
    user.name = "Alice"
    user.name = "Bob"

    val userPasword = UsePasword()
    userPasword.name ="admin123"
    userPasword.name="123admin"
}
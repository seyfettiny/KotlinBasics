package Classes

interface I1 {
    fun foo()
}
open class User(val name: String) {
    open fun getUserName(): String {
        return "User"
    }
}
val fullname : User = object : User("Kotlin"), I1 {
    override fun foo() {
        println(name)
    }
    override fun getUserName(): String {
        return "User"
    }
}
fun main() {
    //fullname.foo()    // error
    println(fullname.getUserName())
    println("Full name: ${fullname.name}")

    //  Android Example
    //  textView.addTextWatcher(object :TextWatcher() {
    //     before
    //     after
    //     on
    //  })
}
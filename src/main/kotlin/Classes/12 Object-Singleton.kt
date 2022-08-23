package Classes

//  Object keyword is used to create singleton class.
//  This usage does not give thread-safe implementation, like in Java with synchronized and volatile keywords.

object SingletonClass{
    var counter: Int = 0
}

fun main() {
    val singleton = SingletonClass
    singleton.counter++
    singleton.counter++
    singleton.counter++
    singleton.counter++
    println(singleton.counter)
}
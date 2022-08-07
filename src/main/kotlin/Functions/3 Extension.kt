package Functions

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    //  Extension functions are helpful when you want to add functionality to a readonly class.
    //  Extension functions are declared outside the class and can be called on any instance of the class.
    //  Extension functions require the receiver type to be specified.
    "Hello".isValidEmail() // false
    "22/05/2020".toDate().print()

    SubClass().print()
}

fun String.isValidEmail(): Boolean {
    return this.contains("@")
}

fun String.toDate(format: String = "dd/MM/yyyy"): Date {
    return SimpleDateFormat(format).parse(this)
}

//  Writing an extension function that solves the problem more generic way is a good idea.
fun Any.print(format: String = "dd/MM/yyyy") {
    println(this)
}

open class ExtensionExample {
    //  Only available to this or subclasses
    fun Int.isEven(): Boolean {
        return this % 2 == 0
    }
}

class SubClass : ExtensionExample() {
    fun print() {
        println(5.isEven())
    }
}

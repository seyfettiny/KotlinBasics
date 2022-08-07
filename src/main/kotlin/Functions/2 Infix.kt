package Functions

fun main() {
    //  Infix functions have four requirements:
    //      Must start with infix keyword
    //      Must be a member function, or an extension function
    //      Must have only one parameter(can not be vararg).
    //      Can not have a default parameter.
    val infixExample = InfixExample()
    infixExample.printValue()
    println(5 isGreaterThan 3)
}
//  This works.
//  Not a member of a class, but is an extension function.
infix fun Int.isGreaterThan(other: Int): Boolean {
    return this > other
}
class InfixExample {
    private infix fun downloadUrl(url: String): String {
        return "Downloading $url"
    }
    private infix fun Int.multiplyAdd(numberTwo: Int): Int {
        return (this * numberTwo) + numberTwo
    }
//    Does not work
//    private infix fun Int.multiplyAdd(numberTwo: Int,numberThree: Int): Int {
//        return (this * numberTwo) + numberTwo
//    }

    private infix fun String.includes(other: String): Boolean {
        return this.contains(other)
    }

    fun printValue() {
        println(5 multiplyAdd 4)
        println("Hello World" includes "Hello")
        println(this downloadUrl "www.google.com")
    }
}

package Functions

fun main() {

    val infixExample = InfixExample()
    infixExample.printValue()
}

class InfixExample {
    //  Infix functions have four requirements:
    //      Must start with infix keyword
    //      Must be a member function, or an extension function
    //      Must have only one parameter(can not be vararg).
    //      Can not have a default parameter.
    private infix fun Int.multiplyAdd(numberTwo: Int): Int {
        return (this * numberTwo) + numberTwo
    }

    private infix fun String.includes(other: String): Boolean {
        return this.contains(other)
    }

    fun printValue() {
        println(5 multiplyAdd 4)
        println("Hello World" includes "Hello")
    }
}

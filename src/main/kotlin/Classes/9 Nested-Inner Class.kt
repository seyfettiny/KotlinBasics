package Classes

//  Nested classes can not access members of outer class
//  Nested classes are static in nature. Due to this, they can be accessed
//  without instantiating.

//  Inner classes are not static. They need to be instantiated.
//  Inner classes can access members of outer class.
//  Reason of Inner classes can access outer class's members and nested classes can't is:
//  Garbage collector can't destroy static members, they will be in memory until application is closed.
//  If Inner classes would be static, since they are accessing outer class's members, outer class's members
//  would not destroy by Garbage collector too. This could lead to memory leak issue too often.


class Outer {
    private val name: String = "Kotlin"
    private fun foo() = 1

    class Nested {
        private val nestedName: String = "Nested"

        fun bar() {
//            println(name)     // ERROR: name is not visible here
//            println(foo())    // ERROR: foo() is not visible here
            println(nestedName)
        }
    }

    inner class Inner {
        fun bar() {
            println(name)
            println(foo())
        }
    }
}

fun main() {
    val outer = Outer()

    val inner = outer.Inner()
    inner.bar()

    Outer.Nested().bar()
}
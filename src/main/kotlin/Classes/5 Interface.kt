package Classes

//  Difference of Interface and Abstract Class:
//  Interfaces can not hold state.
//  Interfaces can be instantiated.
//  Abstract classes "extended", Interfaces "implemented".
//  Multiple inheritance is not allowed in kotlin. So we can not extend multiple classes,
//  but we can implement multiple interfaces.
//  In practice, Abstract classes defines "what" and interfaces defines "how".

interface MyInterface{
    val prop: Int

    //  This implementation do not conflict with "Interfaces can not hold state". The reason is these are not fields.
    //  They are properties. Meaning: they have public getters and setters with private backing fields. That is why
    //  this assignment is valid.
    val propertyWithImplementation: String
        get() = "foo"

//  val propertyWithoutImplementation: String = "bar"       //  This is not valid.

    fun foo() {
        println(prop)
    }
}
interface AnotherInterface{
    fun foo()
    {
        println(this.toString())
    }
}
class ChildClass : MyInterface,AnotherInterface {
    override val prop: Int = 29
    override fun foo() {
        super<AnotherInterface>.foo()
        println("ChildClass")
    }
}

fun main() {
    val object1 = object : MyInterface {
        override val prop: Int = 19
    }
    val childClass = ChildClass()
    childClass.foo()
    object1.foo()
}
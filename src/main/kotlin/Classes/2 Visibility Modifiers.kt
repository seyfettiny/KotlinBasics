package Classes

//  Classes are final by default. In order to override that, we need to make the class open.
open class Foo {
    //  There are four visibility modifiers: public, protected, internal, and private.

    //  In Kotlin variables are public by default
    //  But if we decompile this to the Java code, we will see that the variable is private,
    //  and have public getter and setter.
    //  That's why it is not field, but property.
    public val isFoo = true

    //  private: only visible within the class itself.
    private val name = "Foo"

    //  internal: visible within the module (same module as the class)
    internal val isBar = false

    //  protected: visible within the class and in all subclasses.
    //  protected keyword is only usable when class is extendable, because of that
    //  it can not be used as top level.
    protected val contact = "contact@contact.cn"
}

class Bar : Foo() {
    init {
        //name      //  Error: 'name' is not visible here
        isFoo
        isBar
        contact
    }
}

fun main() {
    val foo = Foo()
    println(foo.isFoo)
    //println(foo.name)     //  Error: name is private
    println(foo.isBar)
    //println(foo.contact)  //  Error: contact is protected
}
package Classes

//  Value classes can not be used without @JvmInline annotation,yet.
//  Value classes can hold only one value.

//  Inline class's constructor is private, so we can not instantiate it. It looks like we can do it but what
//  actually happens is we access that value in constructor, it's not a real object, it's just a value. That value is
//  primitive type, instead of reference type.

//  Value in inline class is immutable, so we can not change it. Also, it has to be val.
//  Inline classes can not be inherited, final by default.
//  Inline classes can implement any interface but can not extend any class.

interface IBase {
    fun getName(): String
}

@JvmInline
value class InlineClass(val value: Int): IBase {
    override fun getName(): String {
        return "InlineClass"
    }
}


fun main() {
    val inlineClass = InlineClass(10)
    println(inlineClass.getName())
    println(inlineClass.value)
}
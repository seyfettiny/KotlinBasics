package Classes

//  Data classes must have at least one parameter in the constructor.

//  Can not be open, abstract, inner, sealed classes.

//  Includes equals, hashCode, toString, copy, componentN, destructuring declarations by default. But these
//  functions only applies for parameters in primary constructor.

//  Parameters in the primary constructor are must have val or var modifiers. Reason of this is,
//  if the parameters are not val or var, they can not be accessed without init block or assigning as a value
//  to another property(this applies to all classes). This is essential because functions above
//  needs to access these parameters.


data class Person(val name: String, val age: Int) {
    val list: List<String> = listOf("a", "b", "c")
}

fun main() {
    val person = Person("John", 30)
    println(person.copy(age = 40))
    println(person.component1())
//  println(person.copy(list = listOf<String>("d", "e", "f")))      //  Compile time error

    val (name, age) = person
    println("$name is $age years old")
}
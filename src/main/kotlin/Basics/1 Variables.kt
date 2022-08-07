//  There is no primitive types in Kotlin. All variables being converted to the bytecode as primitive(UnBoxed).
//  Because of this there is no performance gain compared to reference types(Boxed) variables.
//  Generic or Nullable variables converted to reference type(Boxed) variable.

//  var is mutable, val is immutable

//  === operator used when comparing variable reference
//  ==  operator used when comparing variable value

//  There is no implicit type conversion in Kotlin e.g. val number: Int = (Int) 3L
fun main() {
    var kotlin = "Kotlin"
    var dart: String = "Dart"

}
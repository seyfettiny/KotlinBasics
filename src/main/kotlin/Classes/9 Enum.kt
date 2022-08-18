package Classes

//  Enum classes are used to represent a fixed set of values.
//  Can not be abstract, open, sealed, or inner.
//  Can be accessed without instantiating.
//  All enum constants have a final name: String and final ordinal: Int fields by default.
//  name represents the name of the constant.
//  ordinal represents the position of the constant in the enum declaration.

enum class Color(val shade: Int) {
    RED(200),
    GREEN(700),
    BLUE(300)
}

fun main() {
    println(Color.RED.name)
    println(Color.GREEN.ordinal)
    println(Color.BLUE.shade)


    val colorShade = when(readLine()!!.uppercase()) {
        Color.RED.name -> Color.RED.shade
        Color.GREEN.name -> Color.GREEN.shade
        Color.BLUE.name-> Color.BLUE.shade
        else -> 0
    }
    println(colorShade)
}
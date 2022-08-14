package Classes

fun main() {
    val car = Car(4)
    val car1 = Car(4, make = "Audi")
    val car2 = Car(4, "Blue", "Audi", "A4")
    val car3 = Car(4, "Blue", "Audi", "A4", "Manual", "Automatic", "Electric")
}

class Car(wheels: Int, color: String = "Red") {

    private val wheelCount: Int
    private val mColor: String

    init {
        wheelCount = wheels
        mColor = color
    }

    //  Secondary constructors must point the first constructor with this keyword
    //  First secondary constructor
    constructor(wheels: Int, color: String = "Red", make: String) : this(wheels, color) {
        println(make)
    }

    //  Second secondary constructor
    constructor(wheels: Int, color: String, make: String, model: String) : this(wheels, color) {
        println("$color $make $model")
    }

    //  vararg in constructor is not recommended,
    //  because its become more error-prone when things get complicated.
    //  Better to have explicitly defined parameters in the constructor
    constructor(wheels: Int, vararg info: String) : this(wheels) {
        println("$wheels ${info.joinToString(" ")}")
    }
}

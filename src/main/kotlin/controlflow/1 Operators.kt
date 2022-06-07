package controlflow

fun main() {
    var numberOne = 5
    val numberTwo = 2

    //  If ++ operator used as prefix: first increments then assigns
    //  If ++ operator used as suffix: first assigns then increments
    println("NumberOne: ${numberOne}")
    println("NumberOne: ${numberOne++}")
    println("NumberOne: ${numberOne}")
    println("NumberOne: ${++numberOne}")

    //  There is number extensions for math operators
    print("${numberOne + numberTwo}")
    print("${numberOne.plus(numberTwo)}")

    print("${numberOne - numberTwo}")
    print("${numberOne.minus(numberTwo)}")

    print("${numberOne * numberTwo}")
    print("${numberOne.times(numberTwo)}")

    print("${numberOne / numberTwo}")
    print("${numberOne.div(numberTwo)}")

    print("${numberOne % numberTwo}")
    print("${numberOne.rem(numberTwo)}")
}
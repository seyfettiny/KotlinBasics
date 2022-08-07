fun main() {
    val numbers = 1..100
    val numbers2 = 1.rangeTo(100)

    //  When descending, there is only downTo(). ".." operator does not work
    val numbersDesc = 100.downTo(1)
    val numbersDesc2 = 1.rangeTo(100).reversed()

    //  1 <= numbers < 100
    val numbers3 = 1.until(100)

    val stepNumbers = 1..100 step 2

    val alhabet = 'a'..'z'

    // in operator can be used with ranges
    when(20){
        in numbers -> {
            print("numbers include 20")
        }
        !in stepNumbers -> {
            print("stepNumbers does not include 20")
        }
    }
}
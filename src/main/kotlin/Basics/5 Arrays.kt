fun main() {
    //  Arrays in Kotlin are fixed size lists.

    val numberArray = arrayOf(1, 2, 3, 4, 5, 6)
    val daysArray = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    //  In order to modify elements in the array, you need to define size with
    //  CharArray, IntArray, arrayOfNulls
    val array = arrayOfNulls<String>(4)
    array[0] = "first"
    array[3] = "last"

    print(array[0]+array[3])

    //  We can use <Any> as Type definition. But not recommended as best practice
    val mixedArray = arrayOf<Any>(12, "result", true)

}
package functions

fun main() {
    funFirst()
    println(funSecond())

    //  If there is no given optional parameter to the function, other arguments that comes after
    //  the optional parameters should be named.
    funWithDefaultParameter(name = "User", books = arrayOf("1"))
    funWithDefaultParameter("User", 5, true, arrayOf("2","3"))

    val list= arrayOf("a","b")
    //  Spread operator
    funVararg(*list)
}

    //  Functions are first-class-citizens in Kotlin.
    //  In Kotlin function's return type defined with : operator.
    //  Returning Unit means do not return anything(void).
fun funFirst(): Unit {
    //  This is not allowed in Java.
    fun innerFun(): Unit {

    }
}

fun funSecond(): String {
    return "first function"
}

fun funWithDefaultParameter(name: String, id: Int = 0, isLoggedIn: Boolean = false, books: Array<String>) {

}

    //  If vararg least or only parameter, it converted to the String... at Java
    //  Otherwise converted to the StringArray
fun funVararg(vararg userInfo: String){
    userInfo.forEach { println(it) }
}

val size = 5
fun getItemSize():Int = size
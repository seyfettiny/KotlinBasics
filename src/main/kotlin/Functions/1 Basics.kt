package Functions

fun main() {
    funFirst()
    println(funSecond())

    //  If there is no given optional parameter to the function, other arguments that comes after
    //  the optional parameters should be named.
    funWithDefaultParameter(name = "User", books = arrayOf("1"))

    funWithDefaultParameter("User", arrayOf("2", "3"), 5, true)

    //  If function has vararg and other parameters, parameters that comes after the vararg must be used
    //  as named parameter. That way it can be seperated from vararg elements, otherwise all parameters
    //  can be counted as vararg.
    varargWithDefaultParameter("darkTheme","en_US","USA","notVerified", key = 4)

    val list = arrayOf("a", "b")
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

//  There is no default parameters in Java. So;
//  If the functions that have default parameters will be referenced from Java classes,
//  then @JvmOverloads annotation is needed.
@JvmOverloads
fun funWithDefaultParameter(name: String, books: Array<String>, id: Int = 0, isLoggedIn: Boolean = false) {

}

//  If vararg last or the only parameter, it will be converted to the String... at Java
//  Otherwise converted to the StringArray
fun funVararg(vararg userInfo: String) {
    userInfo.forEach { println(it) }
}

fun varargWithDefaultParameter(vararg preferences: String, key: Int) {
    preferences.forEach { print(it) }
    print(key)

}

val size = 5
fun getItemSize(): Int = size
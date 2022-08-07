package Controlflow

fun main() {
    val name = "Kotlin"

    //  There is two ways of if-else.
    //  State usage: using control flow for executing conditional code blocks
    //  Expression usage: using control flow as assigning value

    //  State usage
    if (name.contains("otl", ignoreCase = true)) {
        print(name)
    } else {
        print(name)
    }

    //  Expression usage
    val result:String = if (name == "Android") {
        "Kotlin"
    } else {
        "Java"
    }
    print(result)

    //  Ternary operator does not supported by Kotlin
    //  But we can mimic that behaviour like this:
    val isTrue = if(true) {"true"} else {"false"}
}
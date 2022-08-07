package Functions

fun main() {
    //  Higher Order Functions - Functions that take other functions as parameters or return functions
    //  Simply, higher order functions are function bodies that given as parameters.
    //  Higher Order Functions offer better performance wise compared to Interfaces*.

    fun foo(higherOrderFunction: (String) -> String) {
        println(higherOrderFunction("Kotlin"))
    }
    foo { it }

    fun bar(higherOrderFunction: (Int,Int) -> Int) {
        println(higherOrderFunction(10,5))
    }
    bar { a, b -> a + b }

    //  There are three types of definitions of higher order functions:

    //  1. Assigning to a variable
    val higherOrderFunction = { surName:String -> println("surname $surName") }

    //  2. Anonymous function
    val anonymousFunction = fun(surName:String) { println("surname $surName") }

    //  3. Expression usage of anonymous function
    val anonymousFunctionExpression = fun(surName:String) = println("surname $surName")

    //  If a function has the same number of parameters as the Higher order function and the types of all
    //  these parameters are the same as the parameter types of the Higher Order Function,
    //  this normal function can also be given as a parameter to a normal function as a Higher order function.
    //  This can be achieved by adding :: before the name of the function.

    val news = News()
    news.read(::println)    //  Equivalent to news.read { title -> println(title) }




}

class News {
    fun read(print: (String) -> Unit) {
        print("News Title")
    }
}
package Functions

fun main() {
    //  Higher Order Functions - Functions that take other functions as parameters or return functions
    //  Simply, higher order functions are function bodies that given as parameters.
    //  Higher Order Functions offer better performance wise compared to Interfaces*.

    fun foo(higherOrderFunction: (String) -> String) {
        println(higherOrderFunction("Kotlin"))
    }
    foo { it }

    fun bar(higherOrderFunction: (Int, Int) -> Int) {
        println(higherOrderFunction(10, 5))
    }
    bar { a, b -> a + b }

    //  There are three types of definitions of higher order functions:

    //  1. Assigning to a variable
    val higherOrderFunction = { name: String -> println("name $name") }
    higherOrderFunction("Kotlin")

    //  2. Anonymous function
    val anonymousFunction = fun(name: String) { println("name $name") }
    anonymousFunction("Kotlin")

    //  3. Expression usage of anonymous function
    val anonymousFunctionExpression = fun(name: String) = println("name $name")
    anonymousFunctionExpression("Kotlin")

    //  If a function has the same number of parameters as the Higher order function and the types of all
    //  these parameters are the same as the parameter types of the Higher Order Function,
    //  this normal function can also be given as a parameter to a normal function as a Higher order function.
    //  This can be achieved by adding :: before the name of the function.

    val news = News()
    news.read(::println)    //  Equivalent to news.read { title -> println(title) }

    news.sortNews(listOf()) { title, body -> title.length + body.length }

    //  Higher order functions can   default parameters as well.
    news.searchNews("NewsTitle", body = { "example" })
}

class News {
    fun read(print: (String) -> Unit) {
        print("News Title")
    }
    fun sortNews(news: List<String>, sort: (String, String) -> Int) {
        news.sortedBy { sort(it, "Kotlin") }
    }

    fun searchNews(title: String, body: (String) -> String = { "Kotlin" }) {
        println(title + body("Kotlin"))
    }
}
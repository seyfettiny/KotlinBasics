package Classes

//  Sealed classes are used to restrict the subclasses of a class.
//  Sealed classes are not static. That's the biggest difference between a sealed class and an enum class.
//  Sealed classes are abstract by default. Because they are abstract, they can't be open. Thus, can't be instantiated.
//  Sealed class's subclasses known at compile time.
//  Sealed classes can have objects. But when we do that, technically, this usage has no difference with an enum class.

sealed class Response
class Success: Response()
class Error: Response()

sealed class Response2
{
    class Success2: Response2()
    class Error2: Response2()
}

fun handleResponse(response: Response)
{
    when(response)
    {
        is Success -> println("Success")
        is Error -> println("Error")
    }
}
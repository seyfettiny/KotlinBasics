fun main() {
    //  If a variable is nullable, Kotlin's Type inference defines variable type as Nothing
    val name: String? = null

    val result: Int?

    //  We can use null check operator like ?. and !! with nullable variables
    //  This operator will throw NullPointerException if variable name is null
    name!!.split(" ")

    //  This calls the method if the property is not null or returns null if that property
    //  is null without throwing a NullPointerException
    name?.lowercase()

    //  Value of result2 is nullnull
    val result2 = null + null
}
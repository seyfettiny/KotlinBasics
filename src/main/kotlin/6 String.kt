fun main() {

    val name = "Kotlin"

    //  Strings are Char Array
    val nameChar = charArrayOf('K','o','t','l','i','n')
    val indices = nameChar.indices

    //  Concatenating only works if String value is written before '+' operator
    val numbersConcat: String = "value "+ 1 + 2

    //  Does not work
    //val numbersConcat2: String = 1 + 2 + "value "

    //  We can use variables in Strings with ${}
    val fullName = "Android and $name"

    //  We can use raw String like this """ String """
    val rawString = """
          *
         **
        ***
       ****
    """.trimIndent()

    //  In raw Strings we can use a margin prefix for removing whitespace before that prefix at that line.
    val rawStringPrefix = """
        *
        **
    $   ***
        ****
    """.trimMargin("$")
}
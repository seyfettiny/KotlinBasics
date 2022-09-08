package Classes

data class User2(
    var name: String = "Kotlin",
    var age: Int = 0,
    var address: String = "Android"
)

class CardDetailFragment{
    val user: User2 by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("User2 created")
        User2()
    }
    lateinit var user2: User2

    lateinit var userType:String

    fun printUserInfo(){
        val localVariable = "localVariable"

        println("User name: ${user.name}")

        if (!::user2.isInitialized) {
            user2 = User2()
        }

        println("User2 name: ${user2.name}")

    }

    init {
        userType = "Premium"
    }
}

fun main() {
    val cardDetailFragment = CardDetailFragment()
    cardDetailFragment.printUserInfo()
    println("User type: ${cardDetailFragment.userType}")
}
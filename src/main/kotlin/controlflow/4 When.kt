package controlflow

fun main() {
    //  when control flow is switch-case in other languages.
    val locale = "en"
    when (locale) {
        "en", "en-US" -> print("English")
        "tr" -> print("Turkish")
        "zh" -> print("Chinese")
        "fr" -> print("French")
        "ru" -> print("Russian")
    }
    when {
        locale == "en" || locale == "en-US" -> print("English")
        locale == "tr" -> print("Turkish")
        locale == "zh" -> print("Chinese")
        locale == "fr" -> print("French")
        locale == "ru" -> print("Russian")
    }
    val number = 4
    when (number) {
        in 0..10 -> {
            println("Lower than 10")
        }
        in 11..20 -> {
            println("Between 10 and 20")
        }
        !in 11..20 -> {
            println("not inside the range of 11 and 20")
        }
    }
}
package loop

fun main() {
    val localeList = arrayOf<String>("en", "tr", "fr", "ru")

    for (locale in localeList) {
        print(locale)
    }

    for (index in localeList.indices) {
        print(index)
    }

    for ((index, locale) in localeList.withIndex()) {
        println("$index: $locale")
    }

    localeList.withIndex().forEach { iterable ->
        print("${iterable.index}: ${iterable.value}")
    }

    for (value in 1..10 step 2) {
        print(value)
    }

    returnLabel@ for (value in 1..10) {
        for (vale2 in 5..20) {
            if (value % 3 == 2) {
                continue@returnLabel
            }
        }
    }
}
package Loop

fun main() {
    //  While loops include both for and if functionality, so using while may gain readability
    //  and a little performance.

    var number = 0

    while (number < 5) {
        print("${number++}")
    }

    //  Same as above
    //    for (value in 0..5) {
    //        if (value < 5)
    //            print("${number++}")
    //    }

}
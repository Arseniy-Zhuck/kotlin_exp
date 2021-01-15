import java.util.*

fun convertStringToDouble(input: String): Double {
    /**
     * It returns a double value or 0 if an exception occurred
     */
    var a = 0.0
    try {
        a = input.toDouble()
    } catch (e: Exception) {

    }
    return a
}


fun main() {
    val scanner = Scanner(System.`in`)
    println(convertStringToDouble(scanner.nextLine()))
}
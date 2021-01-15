import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    try {
        val c = a/b
        println(c)
    } catch (e: ArithmeticException) {
        println("Division by zero, please fix the second argument!")
    }
}
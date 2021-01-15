import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a1 = scanner.nextInt()
    val b1 = scanner.nextInt()
    val a2 = scanner.nextInt()
    val b2 = scanner.nextInt()
    val c = scanner.nextInt()
    println((c in a1..b1) || (c in a2..b2))
}
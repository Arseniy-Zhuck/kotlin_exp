import java.util.*

fun main() {
    var x = 1
    println("Before the loop x = $x")
    while (x < 4) {
        println("In the loop x = $x")
        x = x + 1
    }
    println("After the loop x = $x")
    val scanner = Scanner(System.`in`)
    val y = scanner.nextInt()
    println(if (x > y) "x is greater than y" else "x is not greater than y")

}
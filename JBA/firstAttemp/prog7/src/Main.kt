import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var c = 1
    for (i in a..b-1){
        c = c*i
    }
}
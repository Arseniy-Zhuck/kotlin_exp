import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var x1 = scanner.nextInt()
    var x2 = scanner.nextInt()
    var x3 = scanner.nextInt()
    var y1 = scanner.nextInt()
    var y2 = scanner.nextInt()
    var y3 = scanner.nextInt()
    var t:Int
    if (x1 > x2) {
        t = x1
        x1 = x2
        x2 = t
    }
    if (x2 > x3) {
        t = x2
        x2 = x3
        x3 = t
    }
    if (x1 > x2) {
        t = x1
        x1 = x2
        x2 = t
    }
    if (y1 > y2) {
        t = y1
        y1 = y2
        y2 = t
    }
    if (y2 > y3) {
        t = y2
        y2 = y3
        y3 = t
    }
    if (y1 > y2) {
        t = y1
        y1 = y2
        y2 = t
    }
    if (x1 == y1 && x2 == y2 && x3 == y3) println("Box 1 = Box 2")
    else {
        if (x1 <= y1 && x2 <= y2 && x3 <= y3) println("Box 1 < Box 2")
        else {
            if (x1 >= y1 && x2 >= y2 && x3 >= y3) println("Box 1 > Box 2")
            else println("Incomparable")
        }
    }
    // write your code here
}
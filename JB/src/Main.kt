import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var words: MutableList<String> = mutableListOf()
    while (words.size < 5) {
        words.addAll(scanner.nextLine().split(" "))
        }
    words.forEach { word -> println(word) }
}
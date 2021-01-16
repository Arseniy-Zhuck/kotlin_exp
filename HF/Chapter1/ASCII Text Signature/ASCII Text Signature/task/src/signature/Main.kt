package signature

fun main() {
    var s = readLine()!!
    var l = s.length()
    for (i in 1..(l+4))
        print("*")
    println()
    println("* " + s + " *")
    for (i in 1..(l+4))
        print("*")

}

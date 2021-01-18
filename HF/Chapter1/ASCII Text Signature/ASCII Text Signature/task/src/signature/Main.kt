package signature

fun main() {
    val s = readLine()!!
    val l = s.length
    for (i in 1..l+4)
        print("*")
    println()
    println("* " + s + " *")    
    for (i in 1..l+4)
        print("*")
}

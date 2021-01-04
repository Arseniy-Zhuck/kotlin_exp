fun main(args: Array<String>) {
    println("Pow!")
    var x = 3
    val name = "Cormoran"
    x = x * 10
    print("x = $x")
    while (x > 20) {
        x = x - 1
        println("x is now $x")
    }
    for (i in 1..10) {
        x = x + 1
        println("x is now $x")
    }
    if (x == 20) {
        println("x is 20")
    } else {
        println("x is not 20")
    }
    if (name.equals("Cormoran")) {
        println("$name Strike")
    }

}
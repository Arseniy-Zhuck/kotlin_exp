fun main() {
    var a = 5 // variable a is initialized here
    val b = 29 // variable b is initialized here
    println(a + b)

    var x : Int = 10    // variable x is initialized here
    val y : Long = 88_000_000_000   // variable y is initialized here
    var z : Long = y + x    // variable z is initialized here
    println(z)

    var m = 10  // variable m is initialized here
    var n : Int = 20    // variable n is initialized here
    val p = 30  // variable p is initialized here
    val q : Int = 40    // variable q is initialized here
    var r : Double = ((m + n + p + q).toDouble())   // variable r is initialized here
    println(r)

    var s = "Hello, world!" // variable s is initialized here
    var newS = s + r    // variable newS is initialized here
    val chislo = "5.5"
    println(newS)
    println(r.toString() + s)
    println(r + chislo.toDouble())
    /*
    сложение строк есть просто их конкатенация s1 = "Василий " s2 = "Пупкин" s1 + s2 = "Василий Пупкин"
    когда пытаемся сложить строку и число компилятор смотрит на тип первого аргумента, если первый аргумент строка
    как в строке 19, то второй и последующие аргументы переводятся в строку
    если первый аргумент Double, он хочет и строку перевести в Double, что не очень получается
    и тогда он ругается, в результате я делаю как в строке 22
    и даже если строка число, как в строке 23, все равно так делать нельзя, надо явно осуществить перевод
     */

    println(s + newS)
}
class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {
    println(rectangle.width*rectangle.height)
}

class Point2D {
    val x: Double
    val y: Double
    constructor(x: Double, y: Double) {
        this.x = x
        this.y = y
    }
}

fun main() {

}
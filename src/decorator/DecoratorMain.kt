package decorator

fun main() {
    val circle = Circle()
    val redCircle = RedShapeDecorator(Circle())
    val redRect = RedShapeDecorator(Rectangle())

    println("Circle with normal border")
    circle.draw()

    println("Circle red border")
    redCircle.draw()

    println("Rectangle red border")
    redRect.draw()
}
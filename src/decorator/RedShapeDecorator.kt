package decorator

class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape) {

    override fun draw() {
        super.draw()
        setRedBorder(decoratedShape)
    }

    private fun setRedBorder(decoratedShape: Shape) {
        println("Border color: Red")
    }
}
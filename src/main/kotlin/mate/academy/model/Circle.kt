package mate.academy.model

class Circle(val radius: Double, color: Color) : Figure(color) {
    override fun area() = radius * radius * kotlin.math.PI

    override fun specificInfo() = "radius: $radius units"
}

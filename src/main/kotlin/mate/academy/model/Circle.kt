package mate.academy.model

data class Circle(val radius: Double, override val color: Color) : Figure(color) {
    override fun area() = radius * radius * kotlin.math.PI

    override fun specificInfo() = "radius: $radius units"
}

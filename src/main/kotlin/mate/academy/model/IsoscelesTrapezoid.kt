package mate.academy.model

class IsoscelesTrapezoid(
    val topBase: Double,
    val bottomBase: Double,
    val height: Double,
    override val color: Color
) : Figure(color) {
    override val name: String = "isosceles trapezoid"

    override fun area(): Double = (topBase + bottomBase) * height / 2

    override fun specificInfo(): String {
        return "topBase: $topBase units, bottomBase: $bottomBase units, height: $height units"
    }
}

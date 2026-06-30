package mate.academy.model

class RightTriangle(
    val firstLeg: Double,
    val secondLeg: Double,
    color: Color
) : Figure(color) {
    override val name: String = "right triangle"

    override fun area(): Double = firstLeg * secondLeg / 2

    override fun specificInfo(): String {
        return "firstLeg: $firstLeg units, secondLeg: $secondLeg units"
    }
}

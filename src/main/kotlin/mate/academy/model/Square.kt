package mate.academy.model

/**
 * Square is a special case of a rectangle where width == height.
 * It inherits the rectangle implementation to avoid code duplication.
 */
class Square(val side: Double, color: Color) : Rectangle(side, side, color) {
    override val name = "square"
    // We keep a dedicated `specificInfo` to display a single side value.
    override fun specificInfo() = "side: $side units"
}

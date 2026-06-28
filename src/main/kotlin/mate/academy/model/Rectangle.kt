package mate.academy.model

/**
 * Rectangle figure with width and height.
 * The name is derived from the class name ("rectangle") by the base class.
 */
open class Rectangle(
    val width: Double, val height: Double,
    override val color: Color) : Figure(color) {

    override fun area(): Double = width * height
    override fun specificInfo(): String = "width: $width units, height: $height units"
}

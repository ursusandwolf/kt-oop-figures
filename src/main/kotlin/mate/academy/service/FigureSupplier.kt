package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val TEN = 10.0
private const val MAX = 20.0

class FigureSupplier(private val colorSupplier: ColorSupplier = ColorSupplier()) {

    private val rnd = Random

    /** Returns a randomly chosen figure */
    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        val type = FigureType.values().random()
        return when (type) {
            FigureType.CIRCLE -> Circle(
                radius = rnd.nextDouble(1.0, MAX),
                color = color
            )

            FigureType.RECTANGLE -> Rectangle(
                width = rnd.nextDouble(1.0, MAX),
                height = rnd.nextDouble(1.0, MAX),
                color = color
            )

            FigureType.SQUARE -> Square(
                side = rnd.nextDouble(1.0, MAX),
                color = color
            )

            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                firstLeg = rnd.nextDouble(1.0, MAX),
                secondLeg = rnd.nextDouble(1.0, MAX),
                color = color
            )

            FigureType.ISOSCELES_TRAPEZOID -> {
                val firstBase = rnd.nextDouble(1.0, MAX)
                val secondBase = rnd.nextDouble(1.0, MAX)
                IsoscelesTrapezoid(
                    topBase = minOf(firstBase, secondBase),
                    bottomBase = maxOf(firstBase, secondBase),
                    height = rnd.nextDouble(1.0, MAX),
                    color = color
                )
            }
        }
    }

    /** Returns a white circle with radius 10 */
    fun getDefaultFigure(): Figure = Circle(radius = TEN, color = Color.WHITE)
}

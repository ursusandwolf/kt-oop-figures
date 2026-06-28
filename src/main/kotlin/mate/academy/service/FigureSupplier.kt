package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureKind
import mate.academy.model.Square
import kotlin.random.Random

private const val TEN = 10.0

class FigureSupplier(private val colorSupplier: ColorSupplier = ColorSupplier()) {

    private val rnd = Random

    /** Returns a randomly chosen figure (Circle or Square) with random dimensions */
    fun getRandomFigure(): Figure {
        return when (FigureKind.values().random()) {
            FigureKind.CIRCLE -> Circle(
                radius = rnd.nextDouble(1.0, 20.0),
                color = colorSupplier.getRandomColor()
            )
            FigureKind.SQUARE -> Square(
                side = rnd.nextDouble(1.0, 20.0),
                color = colorSupplier.getRandomColor()
            )
        }
    }

    /** Returns a white circle with radius 10 */
    fun getDefaultFigure(): Figure = Circle(radius = TEN, color = Color.WHITE)
}
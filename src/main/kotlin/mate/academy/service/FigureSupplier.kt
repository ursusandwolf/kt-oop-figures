package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureFactory
import mate.academy.model.FigureType
import mate.academy.model.Rectangle
import mate.academy.model.Square
import kotlin.random.Random

private const val TEN = 10.0
private const val MAX = 20.0

class FigureSupplier(private val colorSupplier: ColorSupplier = ColorSupplier()) {

    private val rnd = Random
    private val factory = FigureFactory()

    /** Returns a randomly chosen figure using FigureFactory with varargs */
    fun getRandomFigure(): Figure {
        val type = FigureType.values().random()
        val dims = when (type) {
            FigureType.CIRCLE -> doubleArrayOf(rnd.nextDouble(1.0, MAX))
            FigureType.RECTANGLE -> doubleArrayOf(rnd.nextDouble(1.0, MAX), rnd.nextDouble(1.0, MAX))
            FigureType.SQUARE -> doubleArrayOf(rnd.nextDouble(1.0, MAX))
        }
        return factory.create(type, *dims, color = colorSupplier.getRandomColor())
    }

    /** Returns a white circle with radius 10 */
    fun getDefaultFigure(): Figure = Circle(radius = TEN, color = Color.WHITE)
}
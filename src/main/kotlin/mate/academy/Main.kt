package mate.academy

import mate.academy.service.FigureSupplier
import mate.academy.model.Figure

fun main() {
    val supplier = FigureSupplier()

    val figures: Array<Figure> = arrayOf(
        supplier.getRandomFigure(),
        supplier.getRandomFigure(),
        supplier.getDefaultFigure(),
        supplier.getDefaultFigure()
    )

    figures.forEach { it.draw() }
}

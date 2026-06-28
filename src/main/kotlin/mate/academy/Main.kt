package mate.academy

import mate.academy.service.FigureSupplier
import mate.academy.model.Figure

fun main() {
    val supplier = FigureSupplier()
    // create a list with 4 figures: 2 random, 2 default
    val figures = mutableListOf<Figure>()
    repeat(2) { figures.add(supplier.getRandomFigure()) }
    repeat(2) { figures.add(supplier.getDefaultFigure()) }
    // draw all figures
    figures.forEach { it.draw() }
}

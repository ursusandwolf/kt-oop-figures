package mate.academy.model

abstract class Figure(color: Color) {
    open val color: Color = color
    open val name: String
        get() = this::class.simpleName?.lowercase() ?: "figure"

    abstract fun area(): Double

    open fun draw() = println(
        "Figure: $name, area: ${area()} sq. units, ${specificInfo()}, color: ${color.name.lowercase()}"
    )

    protected abstract fun specificInfo(): String
}

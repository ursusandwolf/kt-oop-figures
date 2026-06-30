package mate.academy.model

abstract class Figure(val color: Color) {
    open val name: String
        get() = this::class.simpleName?.lowercase() ?: "figure"

    abstract fun area(): Double

    open fun draw() = println(
        "Figure: $name, area: ${area()} sq. units, ${specificInfo()}, color: ${color.name.lowercase()}"
    )

    protected abstract fun specificInfo(): String
}

package mate.academy.model

abstract class Figure(color: Color) {
    open val color: Color = color
    open val name: String
        get() = this::class.simpleName?.lowercase() ?: "figure"

    abstract fun area(): Double
    open fun draw() = println(
        "Figure: $name, area: ${area()}, ${specificInfo()}, color: $color"
    )
    /** each subclass implements this to describe its own fields */
    protected abstract fun specificInfo(): String

}

package mate.academy.model

data class Square(val side: Double, override val color: Color) : Figure(color) {
        override fun area() = side * side
        override fun specificInfo() = "side: $side units"
    }

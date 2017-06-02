package examples

enum class NumberValue {
    ZERO, ONE, MANY
}

fun enumWhen(x: NumberValue): String = when(x) {
    NumberValue.ZERO -> "zero"
    NumberValue.ONE -> "one"
    NumberValue.MANY -> "many"
}
